package mx.androidtitlan.fragmentoverfragment.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

public class SleevePagerViewAdapter extends FragmentStatePagerAdapter {

	@Override
	public Object instantiateItem(ViewGroup arg0, int arg1) {
		return super.instantiateItem(arg0, arg1);
	}

	private List<Fragment> fragments;

	public SleevePagerViewAdapter(FragmentActivity activity,
			List<Fragment> fragments) {
		super(activity.getSupportFragmentManager());
		this.fragments = fragments;
	}

	

	@Override
	public Fragment getItem(int i) {
		return fragments.get(i);
	}

	@Override
	public int getCount() {
		return fragments.size();
	}

}
