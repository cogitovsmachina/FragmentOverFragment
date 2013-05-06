package mx.androidtitlan.fragmentoverfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class SleeveFragment extends Fragment {

	private int mColorRes = -1;
	private String mTitle;

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
//		v.setBackgroundColor(color);
		return v;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("mColorRes", mColorRes);
	}

}
