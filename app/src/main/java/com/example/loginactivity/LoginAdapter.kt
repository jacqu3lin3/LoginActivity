package com.example.loginactivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class LoginAdapter(context: Context, facts:List<LoginModel>):ArrayAdapter<LoginModel>(context, resource, 0, facts) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }
}