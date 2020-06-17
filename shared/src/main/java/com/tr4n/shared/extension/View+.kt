package com.tr4n.shared.extension

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

fun View.showSnackBar(message: String) = Snackbar.make(this, message, Snackbar.LENGTH_SHORT).show()

fun View.showSnackBar(resId: Int) =
    Snackbar.make(this, context.getString(resId), Snackbar.LENGTH_SHORT).show()

fun Context.showToast(message: String?) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun Context.showToast(resId: Int) =
    Toast.makeText(this, getString(resId), Toast.LENGTH_SHORT).show()
