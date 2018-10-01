package com.mnnit.athleticmeet.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragmentra2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragmentra2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmentra2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Fragmentra2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmentra2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmentra2 newInstance(String param1, String param2) {
        Fragmentra2 fragment = new Fragmentra2();
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
    String[] values=new String[]{"9:45 a.m.         110m Hurdles (BOYS)",
            "10:00 a.m.        100m Hurdles (GIRLS)",
            "10:15 a.m.        200m Heats (BOYS)",
            "10:30 a.m.        Shotput (BOYS)",
            "10:45 a.m.        200m Heats (GIRLS)",
            "11:30 a.m.        Shotput (GIRLS)",
            "11:40 a.m.        4x400m Relay Time Trials (BOYS)",
            "12:00 a.m.        4x400m Relay Time Trials (GIRLS)",
            "12:15 p.m.        Tug Of War (BOYS & GIRLS) Heats",
            "                                   ",
            "LUNCH    1:00-2:00 p.m.",
            "                        ",
            "1:30 p.m.         100m Race (Teaching and the Admin,                  Staff and Guest below 45 years )",
            "1:45 p.m.         50m Brisk Walk (Teaching and the Admin,                  Staff and Guest above 45 years )",
            "2:15 p.m.         Javelin (BOYS)",
            "3:30 p.m.         High Jump (BOYS)",
            "4:30 p.m.         High Jump (GIRLS)",
            "5:00 p.m.         4X100m Mixed Relay ",
            "5:15 p.m.         50m Race (Staff Wards below 10years) &                  100m Race (Staff Wards between 10-15 years)",
            "5:30 p.m.         200m Race (Non Teaching Class III and                  Equivalent Tech.Staff)\n       400m Race Non Teaching class IV and Lab Bearers and Equivalent Staff ",
            "6:00 p.m.         Brick Race (MIXED)",};
    ListView lv5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragmentra2, container, false);
        perform(v);

        return v;
        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_fragmentra3, container, false);
    }
    public void perform(View v) {
        lv5 = (ListView)v.findViewById(R.id.list5);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,values);
        lv5.setAdapter(adapter);}

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
