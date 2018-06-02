package com.example.demo.app;

import io.seldon.protos.PredictionProtos;
import io.seldon.protos.PredictionProtos.DefaultData;
import io.seldon.protos.PredictionProtos.SeldonMessage;
import io.seldon.wrapper.api.SeldonPredictionService;
import org.springframework.stereotype.Component;

@Component
public class ExampleModelHandler implements SeldonPredictionService {

    public ExampleModelHandler() {
        System.out.println("building");
    }

    @Override
    public SeldonMessage predict(SeldonMessage payload) {
        return SeldonMessage.newBuilder()
                .setData(DefaultData.newBuilder()
                        .setTensor(PredictionProtos.Tensor.newBuilder().addShape(1).addValues(1.0)))
                .build();
    }

}
