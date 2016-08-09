package com.feicui.navigationviewdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class TodyFragment extends Fragment {

    ISendText mISendText;

    private EditText mEtInput;
    private Button mBtnSend;

    public TodyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tody, container, false);
        mEtInput = (EditText) view.findViewById(R.id.et_input);
        mBtnSend = (Button) view.findViewById(R.id.btn_send);
        mBtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击控件  发送数据给第二个fragment
                String text = mEtInput.getText().toString().trim();
                mISendText.sendText(text);


            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mISendText = (ISendText) context;

    }

    //定义一个内部接口   用来和activity共享数据
    public interface ISendText {
        void sendText (String text);
    }

}
