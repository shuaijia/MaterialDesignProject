package com.jia.mddemo.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jia.mddemo.R;

/**
 * Palette的意思是调色板，它的作用是从图像中提取出突出的颜色，
 * 这样我们可以将提取出来的颜色赋给状态栏、Toolbar、标题栏等，
 * 使得整个界面看起来色调统一，UI风格更加美观和融洽。
 * <p/>
 * VibrantColor(有活力的颜色)
 * LightVibrantColor（有活力的 亮色）
 * DarkVibrantColor（有活力的 暗色）
 * MutedColor（柔和的颜色）
 * LightMutedColor（柔和的 亮色）
 * DarkMutedColor（柔和的 暗色）
 */
public class PaletteActivity extends AppCompatActivity {

    private Toolbar toolbar;

    // 主要图片
    private ImageView iv_palette_img;
    // 有活力的颜色
    private ImageView iv_vibrant;
    // 有活力的 亮色
    private ImageView iv_vibrant_light;
    // 有活力的 暗色
    private ImageView iv_vibrant_dark;
    // 柔和的颜色
    private ImageView iv_muted;
    // 柔和的 亮色
    private ImageView iv_muted_light;
    // 柔和的 暗色
    private ImageView iv_muted_dark;

    // 标题
    private TextView tv_palette_title;
    // 正文
    private TextView tv_palette_content;

    // 上下文
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);
        mContext = PaletteActivity.this;

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        // 主要图片
        iv_palette_img = (ImageView) findViewById(R.id.iv_palette_img);
        // 有活力的颜色
        iv_vibrant = (ImageView) findViewById(R.id.iv_vibrant);
        // 有活力的 亮色
        iv_vibrant_light = (ImageView) findViewById(R.id.iv_vibrant_light);
        // 有活力的 暗色
        iv_vibrant_dark = (ImageView) findViewById(R.id.iv_vibrant_dark);
        // 柔和的颜色
        iv_muted = (ImageView) findViewById(R.id.iv_muted);
        // 柔和的 亮色
        iv_muted_light = (ImageView) findViewById(R.id.iv_muted_light);
        // 柔和的 暗色
        iv_muted_dark = (ImageView) findViewById(R.id.iv_muted_dark);
        // 标题
        tv_palette_title= (TextView) findViewById(R.id.tv_palette_title);
        // 正文
        tv_palette_content= (TextView) findViewById(R.id.tv_palette_content);

        toolbar.setTitle("Palette");
        toolbar.setNavigationIcon(R.mipmap.ic_arrow_back);

        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        pickPicColors();
    }

    private void pickPicColors() {
        Bitmap bitmap = ((BitmapDrawable) iv_palette_img.getDrawable()).getBitmap();
        Palette.Builder builder = Palette.from(bitmap);
        builder.generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                // 提取有活力的颜色
                int vibrantColor = palette.getVibrantColor(Color.RED);
                iv_vibrant.setBackgroundColor(vibrantColor);

                //提取有活力的 亮色
                int lightVibrantColor = palette.getLightVibrantColor(Color.RED);
                iv_vibrant_light.setBackgroundColor(lightVibrantColor);

                //提取有活力的 暗色
                int darkVibrantColor = palette.getDarkVibrantColor(Color.RED);
                iv_vibrant_dark.setBackgroundColor(darkVibrantColor);

                //提取柔和的颜色
                int mutedColor = palette.getMutedColor(Color.RED);
                iv_muted.setBackgroundColor(mutedColor);

                //提取柔和的亮色
                int lightMutedColor = palette.getLightMutedColor(Color.RED);
                iv_muted_light.setBackgroundColor(lightMutedColor);

                //提取柔和的暗色
                int darkMutedColor = palette.getDarkMutedColor(Color.RED);
                iv_muted_dark.setBackgroundColor(darkMutedColor);


                Palette.Swatch vibrantSwatch = palette.getVibrantSwatch();//获取有活力的颜色样本
                Palette.Swatch lightVibrantSwatch = palette.getLightVibrantSwatch();//获取有活力 亮色的样本
                Palette.Swatch drakVibrantSwatch = palette.getDarkVibrantSwatch();//获取有活力 暗色的样本

                Palette.Swatch mutedSwatch = palette.getMutedSwatch();//获取柔和的颜色样本
                Palette.Swatch lightMutedSwatch = palette.getLightMutedSwatch();//获取柔和 亮色的样本
                Palette.Swatch darkMutedSwatch = palette.getDarkMutedSwatch();//获取柔和 暗色的样本


                int titleColor=vibrantSwatch.getTitleTextColor();
                int contentColor=vibrantSwatch.getBodyTextColor();
                tv_palette_title.setTextColor(titleColor);
                tv_palette_content.setTextColor(contentColor);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_palette, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
