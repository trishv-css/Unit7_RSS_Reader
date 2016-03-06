//====================================================
//Title: RSS Reader - RssFeedActivity.java
//Author: Trish Valeri
//Contributors: CIS 3334 & vogella.com
//Date: 3/3/16, 3/4/16
//Purpose: To use fragments to display two activities on one screen. (Port & Landscape)
//====================================================

package com.example.android.rssreader;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RssfeedActivity extends Activity implements MyListFragment.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rssfeed);
    }

    @Override
    public void onRssItemSelected(String link) {
        DetailFragment fragment = (DetailFragment) getFragmentManager()
                .findFragmentById(R.id.detailFragment);
        fragment.setText(link);
    }

}

