package com.example.frontend

import android.content.Context
import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.frontend.FeedScreens.AllFeedFragment
import com.example.frontend.FeedScreens.LikeFeedFragment

internal class FeedViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                AllFeedFragment()
            }
            1 -> {
                LikeFeedFragment()
            }
            else -> {
                throw Resources.NotFoundException("Position Not Found")
            }
        }
    }


}