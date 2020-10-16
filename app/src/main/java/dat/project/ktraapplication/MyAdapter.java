package dat.project.ktraapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class MyAdapter extends ArrayAdapter<String> {
    Context context;
    String rFoodName[];
    String rPrice[];
    int rImg[];

    MyAdapter(Context c, String rFoodName[], String rPrice[], int img[]) {
        super(c, R.layout.row_product, R.id.txtProduct, rPrice);
        this.context = c;
        this.rFoodName = rFoodName;
        this.rPrice = rPrice;
        this.rImg = img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.row_product, parent, false);
        ImageView imageView = row.findViewById(R.id.image);
        TextView txtProduct = row.findViewById(R.id.txtProduct);
        TextView txtPrice = row.findViewById(R.id.txtPrice);

        imageView.setImageResource(rImg[position]);
        txtProduct.setText(rFoodName[position]);
        txtPrice.setText(rPrice[position]);
        return row;
    }
}
