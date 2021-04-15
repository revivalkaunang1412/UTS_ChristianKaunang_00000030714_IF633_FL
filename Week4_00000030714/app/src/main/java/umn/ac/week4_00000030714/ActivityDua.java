package umn.ac.week4_00000030714;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityDua extends AppCompatActivity {
    private TextView tvPesanDiterima;
    private EditText etJawaban;
    private Button btnBalasKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        tvPesanDiterima = findViewById(R.id.pesanDiterima);
        etJawaban = findViewById(R.id.pesanBalik);
        btnBalasKirim = findViewById(R.id.kirimBalik);
        Intent mainIntent = getIntent();
        String pesanDiterima =
                mainIntent.getStringExtra("PesanDariMain");
        tvPesanDiterima.setText(pesanDiterima);

    }
    public void kirimBalik(View view) {
        String jawaban = etJawaban.getText().toString();
        Intent balasIntent = new Intent();
        balasIntent.putExtra("Jawaban", jawaban);
        setResult(RESULT_OK, balasIntent);
        finish();
    }

}