package analysis;

import models.DataSet;

public abstract class AnalysisTemplate implements DataAnalyzer {
    @Override
    public final void analyze(DataSet dataSet) {
        preprocess(dataSet);
        performAnalysis(dataSet);
        postprocess(dataSet);
    }

    protected void preprocess(DataSet dataSet) {
        System.out.println("Предобработка данных...");
        // Здесь можно добавить код для предобработки данных
    }

    protected abstract void performAnalysis(DataSet dataSet);

    protected void postprocess(DataSet dataSet) {
        System.out.println("Постобработка данных...");
        // Здесь можно добавить код для постобработки данных
    }
}
