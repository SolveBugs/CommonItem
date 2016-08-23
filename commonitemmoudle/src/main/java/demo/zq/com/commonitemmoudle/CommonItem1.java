package demo.zq.com.commonitemmoudle;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by zhen on 2016/8/23.
 */
public class CommonItem1 extends RelativeLayout {

    //左边的icon
    private Drawable mImg;

    //文字
    private String mText;

    //文字颜色
    private int mTextColor;

    //文字大小
    private float mTextSize;

    //item背景颜色
    private int mBackgroud;

    //布局最右箭头
    private Drawable mArrowRes;
    //根布局
    private RelativeLayout mRootView;

    //显示图片icon
    private ImageView mImageView;

    //显示家头icon
    private ImageView mArrow;

    //显示文字
    private TextView mTextView;

    public CommonItem1(Context context) {
        super(context);
    }

    public CommonItem1(Context context, AttributeSet attrs) {
        super(context, attrs);
        mRootView = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.common_item1_layout, this);
        initView(context);
        initAttrs(context, attrs);
    }

    /**
     * 获取自定义属性
     *
     * @param context
     * @param attrs
     */
    private void initAttrs(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CommonItem1);

        int mImgResid = a.getResourceId(R.styleable.CommonItem1_img_item, 0);
        int mArrowResid = a.getResourceId(R.styleable.CommonItem1_arrow_item, 0);
        int mTextResid = a.getResourceId(R.styleable.CommonItem1_text_item, 0);
        int mTextColorResid = a.getResourceId(R.styleable.CommonItem1_textcolor_item, 0);
        int mTextSizeResid = a.getResourceId(R.styleable.CommonItem1_textsize_item, 0);
        int mBackgroundResid = a.getResourceId(R.styleable.CommonItem1_background_item, 0);

        if (mImgResid != 0) {
            mImg = context.getResources().getDrawable(mImgResid);
        }

        if (mTextResid != 0) {
            mText = context.getResources().getString(mTextResid);
        }

        if (mTextColorResid != 0) {
            mTextColor = context.getResources().getColor(mTextColorResid);
        }

        if (mTextSizeResid != 0) {
            mTextSize = context.getResources().getDimension(mTextSizeResid);
        }

        if (mArrowResid != 0) {
            mArrowRes = context.getResources().getDrawable(mArrowResid);
        }

        if (mBackgroundResid != 0) {
            mBackgroud = context.getResources().getColor(mBackgroundResid);
        }

        a.recycle();

        mTextView.setText(mText);
        mTextView.setTextColor(mTextColor);
        mTextView.setTextSize(mTextSize);

        mImageView.setBackground(mImg);

        mArrow.setBackground(mArrowRes);

        setBackgroundColor(mBackgroud);
    }

    /**
     * 初始化界面控件
     *
     * @param context
     */
    private void initView(Context context) {
        mImageView = (ImageView) mRootView.findViewById(R.id.image);
        mArrow = (ImageView) mRootView.findViewById(R.id.icon);
        mTextView = (TextView) mRootView.findViewById(R.id.text);
    }
}
