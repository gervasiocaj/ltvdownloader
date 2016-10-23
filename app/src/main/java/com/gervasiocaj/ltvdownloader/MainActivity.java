package com.gervasiocaj.ltvdownloader;

import android.app.Activity;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.SearchView;

import com.gervasiocaj.ltvdownloader.clients.LegendasSearchClient;
import com.gervasiocaj.ltvdownloader.models.SearchResult;
import com.github.nitrico.lastadapter.LastAdapter;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.rest.spring.annotations.RestService;

import java.util.Arrays;
import java.util.List;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @RestService
    LegendasSearchClient searchClient;

    @ViewById(R.id.searchView)
    SearchView searchView;

    @ViewById(R.id.searchResultsView)
    RecyclerView searchResultsView;

    List<SearchResult> searchResults;

    @AfterViews
    void initResults() {
        searchResultsView.setLayoutManager(new LinearLayoutManager(this));
        searchResults = new ObservableArrayList<>();

        LastAdapter.with(searchResults, BR.result)
                .map(SearchResult.class, R.layout.search_result_single)
                .into(searchResultsView);

        searchView.setSubmitButtonEnabled(true);
        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                updateResults(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }

    @Background
    void updateResults(String query) {
        if (query.length() < 2) return;
        Log.i("ltv pesquisa", query);

        List<SearchResult> results = searchClient.search(query);
        Log.i("deu bom", Arrays.toString(results.toArray()));
        abc(results);
    }

    @UiThread
    void abc(List<SearchResult> results) {
        searchResults.addAll(results);

        Log.i("deu bom", searchResults.size() + "");
    }
}
