package es.iessaladillo.pedrojoya.pr01.bmi;

import static es.iessaladillo.pedrojoya.pr01.bmi.BmiClasification.LOW_WEIGHT;
import static es.iessaladillo.pedrojoya.pr01.bmi.BmiClasification.NORMAL_WEIGHT;
import static es.iessaladillo.pedrojoya.pr01.bmi.BmiClasification.OBESITY_GRADE_1;
import static es.iessaladillo.pedrojoya.pr01.bmi.BmiClasification.OBESITY_GRADE_2;
import static es.iessaladillo.pedrojoya.pr01.bmi.BmiClasification.OBESITY_GRADE_3;
import static es.iessaladillo.pedrojoya.pr01.bmi.BmiClasification.OVERWWEIGHT;

/**
 * Allow Bmi calculation and clasification
 */
public class BmiCalculator {

    /**
     * @param weightInKgs Weight of the person in kgs
     * @param heightInMeters Height of the person in meters
     * @return The body mass index (BMI)
     */
    public float calculateBmi(float weightInKgs, float heightInMeters) {
        // TODO
    }


    /**
     * @param bmi Body mass index to get clasification from
     * @return A BmiClasification enum with the clasification of BMI
     */
    public BmiClasification getBmiClasification(float bmi) {
        // TODO
    }

}
