package lab.service;


import lab.model.flowers.Flower;

import java.util.List;

public interface FlowerService {
    List<Flower> getFlowers();

    Flower addFlower(Flower flower);
}
