package crossfader.cuieney.www.crossfader.view.adapter;

import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by WangXiandeng on 2016/11/3.
 */

public abstract class SwipeCardAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    protected List mList;

    public SwipeCardAdapter(List list) {
        mList = list;
    }

    /**
     * 删除最顶部Item
     */

    public void delTopItem() {
        int position = getItemCount() - 1;
        mList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
