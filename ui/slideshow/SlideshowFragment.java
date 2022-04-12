package com.example.artamisportfolioapp.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.artamisportfolioapp.databinding.FragmentSlideshowBinding;

import com.example.artamisportfolioapp.R;
import com.example.artamisportfolioapp.WebViewController;

public class SlideshowFragment extends Fragment
{

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        slideshowViewModel = new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        WebView webView = root.findViewById(R.id.web_view_contact);
        webView.loadUrl("https://www.linkedin.com/in/artamiskarrys/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}