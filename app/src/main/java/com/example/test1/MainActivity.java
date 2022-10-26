package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.test1.adapter.CategoryAdapter;
import com.example.test1.adapter.CourseAdapter;
import com.example.test1.model.Category;
import com.example.test1.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    CourseAdapter courseAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Игры"));
        categoryList.add(new Category(2, "Сайты"));
        categoryList.add(new Category(3, "Языки"));
        categoryList.add(new Category(4 , "Прочее"));
        categoryList.add(new Category(5 , "И ента тоже"));

        setCategoryRecycler(categoryList);

        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "java", "Профессия Java\nразработчик", "10 января", "начальный", "#424345", "Test"));
        courseList.add(new Course(2, "python", "Профессия Python\nразработчик", "1 января", "начальный", "#9FA52D", "TEst"));

        setCourseRecycler(courseList);
    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        courseRecycler = findViewById(R.id.courceRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this,courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this,categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }
}