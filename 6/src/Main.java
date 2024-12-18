import analysis.StatisticalAnalysis;
import analysis.MachineLearningAnalysis;
import analysis.GeneticAlgorithmAnalysis;
import models.DataSet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание набора данных
        DataSet dataSet = new DataSet(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));

        // Выполнение статистического анализа
        StatisticalAnalysis statisticalAnalysis = new StatisticalAnalysis();
        statisticalAnalysis.analyze(dataSet);

        // Выполнение анализа с использованием машинного обучения
        MachineLearningAnalysis machineLearningAnalysis = new MachineLearningAnalysis();
        machineLearningAnalysis.analyze(dataSet);

        // Выполнение анализа с использованием генетических алгоритмов
        GeneticAlgorithmAnalysis geneticAlgorithmAnalysis = new GeneticAlgorithmAnalysis();
        geneticAlgorithmAnalysis.analyze(dataSet);
    }
}
