package com.example.jupviecpj.Activty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
//import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jupviecpj.Adapter.BlockAdapter;
import com.example.jupviecpj.Class.Block;
import com.example.jupviecpj.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BlockNhanVienActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView tvTitleToolbar;

    //Recycler View
    private RecyclerView mRVBlock;
    private RecyclerView.LayoutManager mLayoutManager;

    private ArrayList<Block> blockList;
    private BlockAdapter blockAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block_nhan_vien);

        toolbar = findViewById(R.id.Toolbar_app);
        tvTitleToolbar = findViewById(R.id.toolbar_title);
        AppCompatActivity activity = (AppCompatActivity) this;
        activity.setSupportActionBar(toolbar);
        tvTitleToolbar.setText("Danh sách nhân viên đã chặn");
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);

       SetRVBlockNV();
    }

    public void SetRVBlockNV(){
        mRVBlock = findViewById(R.id.BlockRecyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mRVBlock.setLayoutManager(mLayoutManager);
        blockList = Block.init();
        blockAdapter = new BlockAdapter(this, R.layout.list_block_nhan_vien,blockList);
        mRVBlock.setAdapter(blockAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}