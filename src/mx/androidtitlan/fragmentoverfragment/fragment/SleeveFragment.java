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
import android.support.v4.view.ViewPager;
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

	// public SleeveFragment() {
	// this(R.color.white);
	// }

	// public SleeveFragment(int colorRes) {
	// mColorRes = colorRes;
	// setRetainInstance(true);
	// }

	public SleeveFragment(String title) {
		mTitle = title;
		setRetainInstance(true);
	}

	public SleeveFragment() {
		super();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (savedInstanceState != null)
			mColorRes = savedInstanceState.getInt("mColorRes");
		int color = getResources().getColor(R.color.white);
		inflater.inflate(R.layout.root_fragment, container);
		// construct the RelativeLayout
		RelativeLayout v = new RelativeLayout(getActivity());
		// v.setBackgroundColor(color);
		
		// Setting our ViewPager
		mPagerAdapter = new SleevePagerViewAdapter(getActivity(), createFragments());
		mViewPager = (ViewPager) getActivity().findViewById(R.id.view_pager);
		mViewPager.setAdapter(mPagerAdapter);
		return v;
	}

	private List<Fragment> createFragments() {
		List<Fragment> list = new ArrayList<Fragment>();
		getParentFragment();
		// list.add(Fragment.instantiate(this,
		// FirstSleeveImageFragment.class.getName()));
		list.add(Fragment.instantiate(getActivity(),
				FirstSleeveImageFragment.class.getName()));
		getParentFragment();
		list.add(Fragment.instantiate(getActivity(),
				SecondSleeveImageFragment.class.getName()));
		getParentFragment();
		list.add(Fragment.instantiate(getActivity(),
				ThirdSleeveImageFragment.class.getName()));
		return list;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("mColorRes", mColorRes);
	}

}
