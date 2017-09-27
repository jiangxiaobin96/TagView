package com.example.asus.a1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.a1.db.TagsManager;


public class MainActivity extends Activity {
    private TextView mPromptText;

    private TagGroup mDefaultTagGroup;

    private TagsManager mTagsManager;

    private TagGroup mTagGroup;

    private TagGroup.OnTagClickListener mTagClickListener = new TagGroup.OnTagClickListener() {
        @Override
        public void onTagClick(String tag) {
            Toast.makeText(MainActivity.this, tag, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] tags = {"a","b","c","d","e","f","g"};

        mDefaultTagGroup = (TagGroup) findViewById(R.id.tag_group);
        if (tags != null && tags.length > 0) {
            mDefaultTagGroup.setTags(tags);
        }

        mDefaultTagGroup.setOnTagClickListener(mTagClickListener);
    }


}