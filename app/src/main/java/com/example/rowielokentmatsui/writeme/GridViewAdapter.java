package com.example.rowielokentmatsui.writeme;


        import java.util.ArrayList;
        import android.app.Activity;
        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

public class GridViewAdapter extends BaseAdapter
{
    private ArrayList<String> listCountry;

    private Activity activity;

    public GridViewAdapter(Activity activity,ArrayList<String> listCountry) {
        super();
        this.listCountry = listCountry;
        //Toast.makeText(activity, listCountry.get(1), Toast.LENGTH_SHORT).show();
        this.activity = activity;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listCountry.size();
    }

    @Override
    public String getItem(int position) {
        // TODO Auto-generated method stub
        return listCountry.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static class ViewHolder
    {
        public ImageView imgViewFlag;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder view;
        LayoutInflater inflator = activity.getLayoutInflater();

//        BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        // Bitmap bitmap = BitmapFactory.decodeFile(photoPath, options);
        // Toast.makeText(this, photoPath, Toast.LENGTH_SHORT).show();
//
        //  omg.setImageBitmap(bitmap);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = BitmapFactory.decodeFile(listCountry.get(position), options);
      //  Toast.makeText(activity, listCountry.get(position), Toast.LENGTH_SHORT).show();
        if(convertView==null)
        {
            view = new ViewHolder();
            convertView = inflator.inflate(R.layout.grid_item, null);



            view.imgViewFlag = (ImageView) convertView.findViewById(R.id.imageView1);

            convertView.setTag(view);
        }
        else
        {
            view = (ViewHolder) convertView.getTag();
        }


        view.imgViewFlag.setImageBitmap(bitmap);

        return convertView;
    }
}