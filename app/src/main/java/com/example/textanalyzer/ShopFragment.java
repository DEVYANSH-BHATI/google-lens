package com.example.textanalyzer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShopFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ShopFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShopFragment newInstance(String param1, String param2) {
        ShopFragment fragment = new ShopFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_shop, container, false);

        ImageButton git1 = view.findViewById(R.id.git1);
        ImageButton git2 = view.findViewById(R.id.git2);
        ImageButton git3 = view.findViewById(R.id.git3);
        ImageButton link1 = view.findViewById(R.id.link1);
        ImageButton link2 = view.findViewById(R.id.link2);
        ImageButton link3 = view.findViewById(R.id.link3);
        ImageButton gm1 = view.findViewById(R.id.gm1);
        ImageButton gm2 = view.findViewById(R.id.gm2);
        ImageButton gm3 = view.findViewById(R.id.gm3);
        ImageButton ig1 = view.findViewById(R.id.ig1);
        ImageButton ig2 = view.findViewById(R.id.ig2);
        ImageButton ig3 = view.findViewById(R.id.ig3);

        git1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://github.com/anshul-sharma-2002"));
                startActivity(viewIntent);
            }
        });
        git2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://github.com/singh-harish"));
                startActivity(viewIntent);
            }
        });
        git3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://github.com/DEVYANSH-BHATI"));
                startActivity(viewIntent);
            }
        });

        link1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.linkedin.com/in/anshul-sharma-1232a91b0"));
                startActivity(viewIntent);
            }
        });
        link2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.linkedin.com/in/singh-harish"));
                startActivity(viewIntent);
            }
        });
        link3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.linkedin.com/in/devyansh-bhati-76aa701b6"));
                startActivity(viewIntent);
            }
        });

        gm1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("mailto:anshulpuransharma@gmail.com"));
                startActivity(viewIntent);
            }
        });
        gm2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("mailto:singhharish734@gmail.com"));
                startActivity(viewIntent);
            }
        });
        gm3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("mailto:devyansh.bhati333@pec.edu"));
                startActivity(viewIntent);
            }
        });

        ig1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://instagram.com/anshul.231"));
                startActivity(viewIntent);
            }
        });
        ig2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://instagram.com/singh_harish_ig"));
                startActivity(viewIntent);
            }
        });
        ig3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://instagram.com/devyansh.bhati444"));
                startActivity(viewIntent);
            }
        });

        return view;
    }
}