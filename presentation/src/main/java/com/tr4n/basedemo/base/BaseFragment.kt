package com.tr4n.basedemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.tr4n.shared.extension.showSnackBar
import com.tr4n.shared.extension.showToast
import java.net.HttpURLConnection


abstract class BaseFragment<VB : ViewDataBinding, VM : BaseViewModel> : Fragment() {

    protected lateinit var viewDataBinding: VB

    @get:LayoutRes
    protected abstract val layoutResource: Int

    protected abstract val viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        viewDataBinding = DataBindingUtil.inflate(inflater, layoutResource, container, false) as VB
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpView()
        setBindingVariables()
        initData()
        observe()
    }

    /**
     * Set value for binding variables
     */
    open fun setBindingVariables() {
    }

    /**
     * Init your views, when they are ready.
     */
    open fun setUpView() {}

    /**
     * Observe the data change from your viewModel.
     */
    open fun observe() {
        clearOldObservers()
        viewModel.messageToast.observe(viewLifecycleOwner, Observer(::showToast))
        viewModel.messageSnackBar.observe(viewLifecycleOwner, Observer(::showSnackBar))
    }

    private fun showToast(data: Any) {
        when (data) {
            is Int -> context?.showToast(data)
            is String -> context?.showToast(data)
            is Throwable ->
                context?.showToast(data.message)
            else -> context?.showToast(data.toString())
        }
    }

    private fun showSnackBar(data: Any) {
        when (data) {
            is Int -> view?.showSnackBar(data)
            is String -> view?.showSnackBar(data)
            else -> view?.showSnackBar(data.toString())
        }
    }

    /**
     * Optional, To remove all unnecessary old observers before register the new.
     */
    open fun clearOldObservers() {}

    /**
     * Optional, request the data of screen on the first time.
     */
    open fun initData() {}
}
