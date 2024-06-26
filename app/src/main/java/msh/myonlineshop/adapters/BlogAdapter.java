package msh.myonlineshop.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import msh.myonlineshop.R;
import msh.myonlineshop.clients.base.ApiAddresses;
import msh.myonlineshop.models.Blog;

public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.ViewHolder>{

    private List<Blog> lst = new ArrayList<>();;
    private Activity activity;

    public BlogAdapter(Activity activity, List<Blog> lst) {
        this.lst = lst;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context ctx = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(ctx);
        View v = layoutInflater.inflate(R.layout.layout_item_blog, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Blog blog = lst.get(position);
        //
        holder.tvBlogTitle.setText(blog.getTitle());
        holder.tvBlogSubtitle.setText(blog.getSubtitle());
        //
        String url = ApiAddresses.getFileUrl(blog.getImage());
        Picasso.get().load(url)
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_loading)
                .into(holder.ivBlogImage);
    }

    @Override
    public int getItemCount() {
        return lst.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView ivBlogImage;
        public TextView tvBlogTitle, tvBlogSubtitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivBlogImage = itemView.findViewById(R.id.ivBlogImage);
            tvBlogTitle = itemView.findViewById(R.id.tvBlogTitle);
            tvBlogSubtitle = itemView.findViewById(R.id.tvBlogSubtitle);
        }
    }
}
