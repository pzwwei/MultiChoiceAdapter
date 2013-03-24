/*
 * Copyright (C) 2013 Manuel Peinado
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.manuelpeinado.multichoiceadapter.demo;

import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CheckboxItemsAdapter extends BaseAdapter {

    protected static final String TAG = CheckboxItemsAdapter.class.getSimpleName();

    public CheckboxItemsAdapter(Bundle savedInstanceState, List<String> items) {
        super(savedInstanceState, items);
    }

    @Override
    protected View getViewImpl(int position, View convertView, ViewGroup parent) {
        ViewGroup root;
        if (convertView != null) {
            root = (ViewGroup) convertView;
        } else {
            int layout = R.layout.checkbox_list_item;
            LayoutInflater inflater = LayoutInflater.from(getContext());
            root = (ViewGroup) inflater.inflate(layout, parent, false);
        }
        TextView textView = (TextView) root.findViewById(android.R.id.text1);
        String item = getItem(position);
        textView.setText(item);
        return root;
    }
}