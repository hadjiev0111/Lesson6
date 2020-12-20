package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.lesson6.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        setContentView(v);
        actions();
    }

    public void actions() {
        math = new Math();
        binding.addition.setOnClickListener(v -> {
                    int result = math.addition(Integer.parseInt(binding.firstNumber.getText().toString()),
                            Integer.parseInt(binding.secondNumber.getText().toString()));
                    binding.result.setText(String.valueOf(result));
                }
        );

        binding.subtraction.setOnClickListener(v -> {
                    int result = math.subtraction(Integer.parseInt(binding.firstNumber.getText().toString()),
                            Integer.parseInt(binding.secondNumber.getText().toString()));
                    binding.result.setText(String.valueOf(result));
                }
        );

        binding.multiply.setOnClickListener(v ->{
                    int result = math.multiply(Integer.parseInt(binding.firstNumber.getText().toString()),
                            Integer.parseInt(binding.secondNumber.getText().toString()));
                    binding.result.setText(String.valueOf(result));
                }
        );

        binding.division.setOnClickListener(v ->{
                    int result = math.division(Integer.parseInt(binding.firstNumber.getText().toString()),
                            Integer.parseInt(binding.secondNumber.getText().toString()));
                    binding.result.setText(String.valueOf(result));
                }
        );
    }
}