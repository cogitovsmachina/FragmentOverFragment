package mx.androidtitlan.fragmentoverfragment.fragment;

import java.util.ArrayList;
import java.util.List;

import com.actionbarsherlock.app.ActionBar;

import mx.androidtitlan.fragmentoverfragment.R;
import mx.androidtitlan.fragmentoverfragment.R.color;
import mx.androidtitlan.fragmentoverfragment.R.layout;
import mx.androidtitlan.fragmentoverfragment.adapter.SleevePagerViewAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class SleeveFragment extends Fragment {

	private int mColorRes = -1;
	private String mTitle;
	private SleevePagerViewAdapter mPagerAdapter;
	private ViewPager mViewPager;
	private int mChannel;

	// public SleeveFragment() {
	// this(R.color.white);
	// }

	// public SleeveFragment(int colorRes) {
	// mColorRes = colorRes;
	// setRetainInstance(true);
	// }

	public SleeveFragment(String title, int channel) {
		mTitle = title;
		mChannel = channel;
		setRetainInstance(true);
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (savedInstanceState != null)
			mTitle = savedInstanceState.getString(mTitle);
		inflater.inflate(R.layout.root_fragment, container);
		// construct the RelativeLayout
		RelativeLayout v = new RelativeLayout(getActivity());
		getActivity().setTitle(mTitle);
		return v;
	}
	

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("mColorRes", mColorRes);
	}

}
