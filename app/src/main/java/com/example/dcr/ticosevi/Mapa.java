package com.example.dcr.ticosevi;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        OnclickDelButton(R.id.btnSatelite);
        OnclickDelButton(R.id.btnTerreno);
        OnclickDelButton(R.id.btnVolver);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

// Add a marker in milugar and move the camera
        final LatLng milugar = new LatLng(9.971157, -84.129138);
//mMap.getMinZoomLevel();
        mMap.addMarker(new MarkerOptions().position(milugar).title("Mi ubicación"));
        int zoomLevel = 7; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(milugar, zoomLevel));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        marcas();

        // Colocar dentro de onMapReady
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Mensaje("Las coordenadas son: "+ milugar);
                return false;
            }
        });




    }

    public void OnclickDelButton(int ref) {

        // Ejemplo  OnclickDelButton(R.id.MiButton);
        // 1 Doy referencia al Button
        View view = findViewById(ref);
        Button miButton = (Button) view;
        //  final String msg = miButton.getText().toString();
        // 2.  Programar el evento onclick
        miButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if(msg.equals("Texto")){Mensaje("Texto en el botón ");};
                switch (v.getId()) {

                    case R.id.btnSatelite:
                        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                        break;

                    case R.id.btnTerreno:
                        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                        break;

                    case R.id.btnVolver:
                         Intent intento = new Intent(getApplicationContext(), Actividad02.class);
                         startActivity(intento);
                        break;
                    default:
                        break;
                }// fin de casos
            }// fin del onclick
        });
    }// fin de OnclickDelButton

    public void marcas() {

// Add a marker in milugar and move the camera
        LatLng milugar = new LatLng(9.861217, -83.810037);
//mMap.getMinZoomLevel();
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.viaje)).position(milugar).title("Academia de Manejo grupo Peraza"));
        int zoomLevel = 7; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(milugar, zoomLevel));



        // Add a marker in milugar and move the camera
        LatLng milugar2 = new LatLng(9.931566, -84.073709);
//mMap.getMinZoomLevel();
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.viaje)).position(milugar2).title("Escuela de manejo Rodriguez"));
        int zoomLevel2 = 7; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(milugar2, zoomLevel2));

        // Add a marker in milugar and move the camera
        LatLng milugar3 = new LatLng(10.329018, -84.340127);
//mMap.getMinZoomLevel();
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.viaje)).position(milugar3).title("Escuela de manejo del norte"));
        int zoomLevel3 = 7; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(milugar3, zoomLevel3));


        // Add a marker in milugar and move the camera
        LatLng milugar4 = new LatLng(9.996577, -84.131080);
//mMap.getMinZoomLevel();
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.viaje)).position(milugar4).title("Escuela de manejo Educar"));
        int zoomLevel4 = 7; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(milugar4, zoomLevel4));


        // Add a marker in milugar and move the camera
        LatLng milugar5 = new LatLng(9.934130, -84.058925);
//mMap.getMinZoomLevel();
        mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.viaje)).position(milugar5).title("AutoEscuela B1"));
        int zoomLevel5 = 7; //This goes up to 21
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(milugar5, zoomLevel5));

    }

    public void Mensaje(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();};
}
