package com.example.lenovo.hencoderpracticedraw1;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

//import android.util.Log;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mView;
    private List<String> mList;
    private MyAdapter.ViewHolder mHolder=null;
    private List<BaseView> mListView;
    private ViewPager mPager;
    private String  sign;
    private int text_Only=0;
    private int IMAGE_LEFT=2;
    private int IMAGE_RIGHT=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mView=findViewById(R.id.rv_view);
        mPager=findViewById(R.id.vp_pager);

        initData();
    }

    private void initData() {
        mListView=new ArrayList();
        mListView.add(new ColorDraw(this));
        mListView.add(new CilcleColor(this));
        mListView.add(new BingDraw(this));
        mListView.add(new TuDraw(this));
        mListView.add(new LinearGradientDraw(this));
        mListView.add(new RadialGradientView(this));
        mListView.add(new DrawSweepGradient(this));
        mListView.add(new BitmapShaderView(this));
        mListView.add(new ComposeShaderView(this));
        mListView.add(new LightingColorFilterView(this));
        mPager.setAdapter(new MyPagerAdapter());
        mPager.setCurrentItem(0);
        mList=new ArrayList<>();
        mList.add("drawColor()");
        mList.add("drawCircle()");
        mList.add("饼图");
        mList.add("直方图");
        mList.add("线性渐变");
        mList.add("辐射渐变");
        mList.add("扫描渐变");
        mList.add("截图");
        mList.add("混合着色器");
        mList.add("LightingColorFilter");
        mList.add("LightingColorFilter");
        mList.add("LightingColorFilter");
        mList.add("LightingColorFilter");

        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mView.setLayoutManager(manager);
        mView.setAdapter(new MyAdapter());
    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_layout, viewGroup, false);
            final ViewHolder holder = new ViewHolder(view);
            Log.i("PPPPPPPPPPPPPPPPP", "onClick: i的值" + viewGroup.getChildAt(i));
            holder.text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    mHolder.text.setTextColor(Color.parseColor("#AAAAAA"));
                    mHolder.view.setBackgroundColor(Color.TRANSPARENT);
                    mHolder = holder;
                    holder.text.setTextColor(Color.BLACK);
                    holder.view.setBackgroundColor(Color.BLACK);
                    mPager.setCurrentItem(holder.getAdapterPosition());


                }
            });
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            if (mHolder == null) {
                mHolder = viewHolder;
                viewHolder.text.setTextColor(Color.BLACK);
                viewHolder.view.setBackgroundColor(Color.BLACK);
                Log.i("PPPPPPPPPPPPPPPPP", "onClick: 第一个" + viewHolder);
            }
            viewHolder.text.setText(mList.get(i));
        }

        @Override
        public int getItemCount() {
            return mList.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            TextView text;
            View view;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                text = itemView.findViewById(R.id.tv_item);
                view = itemView.findViewById(R.id.v_view);
            }
        }
        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public int getItemViewType(int position) {
            return position;
        }
    }


     class MyPagerAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return mListView.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view==o;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            BaseView baseView=mListView.get(position);
            View view=baseView.initView();
            container.addView(view);

            return view;
        }
    }
}
