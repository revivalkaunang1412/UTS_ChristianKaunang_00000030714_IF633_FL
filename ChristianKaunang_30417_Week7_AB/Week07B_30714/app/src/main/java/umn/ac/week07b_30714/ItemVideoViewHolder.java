package umn.ac.week07b_30714;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemVideoViewHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener {
    private TextView tvJudul;
    private TextView tvKeterangan;
    private TextView tvUri;
    private DaftarVideoAdapter mAdapter;
    private int mPosisi;
    private SumberVideo mSumberVideo;

    public ItemVideoViewHolder(@NonNull View itemView,
                               DaftarVideoAdapter adapter) {
        super(itemView);
        mAdapter = adapter;
        VideoView kotakVideo = (VideoView) itemView.findViewById(R.id.kotakVideo);
        tvJudul = (TextView) itemView.findViewById(R.id.tvJudul);
        tvKeterangan = (TextView) itemView.findViewById(
                R.id.tvKeterangan);
        tvUri = (TextView) itemView.findViewById(R.id.tvUri);
        itemView.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        mPosisi = getLayoutPosition();
        mSumberVideo = mDaftarVideo.get(mPosisi);
        Context mContext;
        Intent detilInten = new Intent(mContext,
                DetilVideoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("DetilVideo",mSumberVideo);
        detilInten.putExtras(bundle);
        mContext.startActivity(detilInten);
    }


}
