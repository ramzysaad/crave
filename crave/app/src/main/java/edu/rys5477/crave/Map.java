package edu.rys5477.crave;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

public class Map extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap mGoogleMape;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (googleApiAvailability()) {
            Toast.makeText(this, "perfect", Toast.LENGTH_LONG).show();
            setContentView(R.layout.activity_map);

        }else {

        }
    }


    private void initMap() {
        MapFragment mapFragment= (MapFragment) getFragmentManager().findFragmentById(R.id.mapFragment);
        mapFragment.getMapAsync(this);
    }


    public boolean googleApiAvailability(){
        GoogleApiAvailability api = GoogleApiAvailability.getInstance();
        int isAvalible = api.isGooglePlayServicesAvailable(this);
        if (isAvalible == ConnectionResult.SUCCESS){
            return true;
        } else if (api.isUserResolvableError(isAvalible)) {
            Dialog dialog = api.getErrorDialog(this, isAvalible,0);
            dialog.show();;
        }else {
            Toast.makeText(this ,"Cant connect to play services", Toast.LENGTH_LONG).show();

        }
        return false;
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {

        mGoogleMape =googleMap;
        goToLocationZoom( 40.2956304,-76.8284822,18);
    }

    private void goToLocation(double lat, double lng) {
        LatLng ll= new LatLng(lat, lng);
        CameraUpdate update = CameraUpdateFactory.newLatLng(ll);
        mGoogleMape.moveCamera(update);
    }

    private void goToLocationZoom(double lat, double lng, int zoom) {
        LatLng ll= new LatLng(lat, lng);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(ll, zoom);
        mGoogleMape.moveCamera(update);
    }






}
