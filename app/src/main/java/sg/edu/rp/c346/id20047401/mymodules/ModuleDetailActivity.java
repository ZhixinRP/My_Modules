package sg.edu.rp.c346.id20047401.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModuleCode,tvModuleName,tvAcademicYear,tvSemester,tvModuleCredit,tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleCode = findViewById(R.id.textViewModuleCode);
        tvModuleName = findViewById(R.id.textViewModuleName);
        tvAcademicYear = findViewById(R.id.textViewAcademicYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvModuleCredit = findViewById(R.id.textViewModuleCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();


        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        String moduleName = intentReceived.getStringExtra("ModuleName");
        int academicYear = intentReceived.getIntExtra("AcademicYear",0);
        int semester = intentReceived.getIntExtra("Semester", 0);
        int moduleCredit = intentReceived.getIntExtra("ModuleCredit",0);
        String venue = intentReceived.getStringExtra("Venue");

        tvModuleCode.setText(" " + moduleCode);
        tvModuleName.setText(" " + moduleName);
        tvAcademicYear.setText(" " + academicYear);
        tvSemester.setText(" " + semester);
        tvModuleCredit.setText(" " + moduleCredit);
        tvVenue.setText(" " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

} 