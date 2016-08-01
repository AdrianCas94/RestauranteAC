package faccirestaurantac.com.restaurantac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityAC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_ac);

    }

    public void click1(View v ){
        Toast.makeText(MainActivityAC.this, "Bandeja de mariscos" ,Toast.LENGTH_SHORT).show();

    }

    public void click2(View v ){
        Toast.makeText(MainActivityAC.this, "Caldo de gallina criolla" ,Toast.LENGTH_SHORT).show();

    }

    public void click3(View v ){
        Toast.makeText(MainActivityAC.this, "Ceviche de Camarón " ,Toast.LENGTH_SHORT).show();

    }

    public void click4(View v ){
        Toast.makeText(MainActivityAC.this, "Arroz con menestra y carne asada" ,Toast.LENGTH_SHORT).show();

    }

    public void click5(View v ){
        Toast.makeText(MainActivityAC.this, "Pescado frito con patacones" ,Toast.LENGTH_SHORT).show();

    }

    public void click6(View v ){
        Toast.makeText(MainActivityAC.this, "Arroz marinero" ,Toast.LENGTH_SHORT).show();

    }

    public void click7(View v ){
        Toast.makeText(MainActivityAC.this, "Bandera" ,Toast.LENGTH_SHORT).show();

    }

}
