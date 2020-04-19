package fr.alasdiablo.janoeo.data;

public class MohsScale {

    public static class RawsValues {
        public static final float LEAD       = 1.5f;
        public static final float TIN        = 1.5f;
        public static final float ALUMINIUM  = 2.25f;
        public static final float GOLD       = 2.25f;
        public static final float SILVER     = 2.5f;
        public static final float ZINC       = 2.5f;
        public static final float COPPER     = 3f;
        public static final float IRON       = 4.5f;
        public static final float URANIUM    = 6f;
        public static final float EMERALD    = 7.5f;
        public static final float DIAMOND    = 10f;
    }

    public static class ArmorsValues {
        public static final float LEAD       = getArmorsValues(RawsValues.LEAD);
        public static final float TIN        = getArmorsValues(RawsValues.TIN);
        public static final float ALUMINIUM  = getArmorsValues(RawsValues.ALUMINIUM);
        public static final float GOLD       = getArmorsValues(RawsValues.GOLD);
        public static final float SILVER     = getArmorsValues(RawsValues.SILVER);
        public static final float ZINC       = getArmorsValues(RawsValues.ZINC);
        public static final float COPPER     = getArmorsValues(RawsValues.COPPER);
        public static final float IRON       = getArmorsValues(RawsValues.IRON);
        public static final float URANIUM    = getArmorsValues(RawsValues.URANIUM);
        public static final float EMERALD    = getArmorsValues(RawsValues.EMERALD);
        public static final float DIAMOND    = getArmorsValues(RawsValues.DIAMOND);

        public static int getArmorsValues(float mohsValues) {
            return Math.round(mohsValues * 3.3f);
        }
    }
}
