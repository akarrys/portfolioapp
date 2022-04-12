package com.example.artamisportfolioapp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.artamisportfolioapp.databinding.FragmentGalleryBinding;

import com.example.artamisportfolioapp.R;
import com.example.artamisportfolioapp.WebViewController;

public class GalleryFragment extends Fragment
{

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        galleryViewModel = new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        WebView webView = root.findViewById(R.id.web_view_projects);
        webView.loadUrl("https://github.com/akarrys");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}