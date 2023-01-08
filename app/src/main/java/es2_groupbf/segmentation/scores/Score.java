package es2_groupbf.segmentation.scores;

import es2_groupbf.entities.Client;

import java.util.List;

public interface Score {
    void calculateScore(List<Client> clients);
}
