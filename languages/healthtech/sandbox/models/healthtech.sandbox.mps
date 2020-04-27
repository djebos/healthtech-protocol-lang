<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:8f073bb7-20a3-46da-a632-ccf2b66ec6e7(healthtech.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="302f6a2f-7149-4d75-8daf-01fecbeaf5d3" name="healthtech" version="0" />
  </languages>
  <imports />
  <registry>
    <language id="302f6a2f-7149-4d75-8daf-01fecbeaf5d3" name="healthtech">
      <concept id="52719422298890065" name="healthtech.structure.TemperatureMeasurement" flags="ng" index="6mddo" />
      <concept id="52719422298690148" name="healthtech.structure.MeasurementType2UnitMapping" flags="ng" index="6mXTH">
        <property id="52719422298690155" name="unit" index="6mXTy" />
        <child id="52719422298690149" name="type" index="6mXTG" />
      </concept>
      <concept id="52719422298945255" name="healthtech.structure.PulseMeasurement" flags="ng" index="6nNFI" />
      <concept id="52719422298509763" name="healthtech.structure.MeasurementUnitConfig" flags="ng" index="6pDRa">
        <child id="52719422298789755" name="mappings" index="6mlHM" />
      </concept>
      <concept id="52719422309725767" name="healthtech.structure.MeasurementOperand" flags="ng" index="7cVDe">
        <property id="52719422309725768" name="unit" index="7cVD1" />
      </concept>
      <concept id="52719422303626052" name="healthtech.structure.MeasurementOperandAdapter" flags="ng" index="7$aXd">
        <child id="52719422303626075" name="operand" index="7$aXi" />
      </concept>
      <concept id="3423319196905167580" name="healthtech.structure.MeasurementRange" flags="ng" index="zNcxK">
        <child id="2249746781630977555" name="measurement" index="Ayubk" />
        <child id="4414035954634025316" name="rangeOperator" index="1gwEsO" />
      </concept>
      <concept id="3423319196905791784" name="healthtech.structure.MeasurementBinaryOperator" flags="ng" index="zQBe4">
        <child id="2249746781628469892" name="secondOperand" index="AGUp3" />
        <child id="4414035954634025321" name="operand" index="1gwEsT" />
      </concept>
      <concept id="2249746781630680043" name="healthtech.structure.OutputResult" flags="ng" index="A_7WG">
        <property id="2249746781630680044" name="result" index="A_7WF" />
      </concept>
      <concept id="2249746781628734567" name="healthtech.structure.GlucoseMeasurement" flags="ng" index="AHUyw" />
      <concept id="4414035954634025311" name="healthtech.structure.MeasurementRangeOperator" flags="ng" index="1gwEsf" />
      <concept id="4414035954634025324" name="healthtech.structure.IntegerConstant" flags="ng" index="1gwEsW">
        <property id="4414035954634151004" name="value" index="1gx9Cc" />
      </concept>
      <concept id="4414035954635544457" name="healthtech.structure.WeightMeasurement" flags="ng" index="1gAPBp" />
      <concept id="4414035954635544461" name="healthtech.structure.BloodPressureMeasurement" flags="ng" index="1gAPBt" />
      <concept id="4732312587025522455" name="healthtech.structure.EvaluationEntry" flags="ng" index="3qq98I">
        <child id="3423319196905167625" name="range" index="zNcA_" />
        <child id="2249746781630680066" name="output" index="A_7z5" />
      </concept>
      <concept id="4732312587025367010" name="healthtech.structure.Protocol" flags="ng" index="3qrjbr">
        <property id="4732312587025391816" name="description" index="3qrERL" />
        <property id="4732312587025391818" name="reference" index="3qrERN" />
        <child id="4732312587025522452" name="eval" index="3qq98H" />
        <child id="4732312587025391857" name="inputSpecs" index="3qrER8" />
      </concept>
      <concept id="4732312587025391821" name="healthtech.structure.InputSpec" flags="ng" index="3qrERO">
        <property id="4732312587025391859" name="timeRange" index="3qrERa" />
        <property id="4732312587025391862" name="size" index="3qrERf" />
        <child id="4414035954635639202" name="measure" index="1gBsvM" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="3qrjbr" id="46GzjArKSFJ">
    <property role="TrG5h" value="hypertension" />
    <property role="3qrERL" value="Hypertension is a desease with blood pressure more than 140/90" />
    <property role="3qrERN" value="https://guidelines.moz.gov.ua/documents/2988" />
    <node concept="3qrERO" id="2Vj0$6XOf4" role="3qrER8">
      <property role="3qrERf" value="1" />
      <property role="3qrERa" value="2" />
      <node concept="1gAPBt" id="2Vj0$6XOf8" role="1gBsvM">
        <property role="TrG5h" value="blood pressure" />
      </node>
    </node>
  </node>
  <node concept="3qrjbr" id="46GzjArLO4K">
    <property role="TrG5h" value="diabetes" />
    <property role="3qrERL" value="Diabetes clinic protocol adaptation" />
    <property role="3qrERN" value="https://guidelines.moz.gov.ua/documents/3322" />
    <node concept="3qq98I" id="2Vj0$7AN63" role="3qq98H">
      <node concept="zNcxK" id="2Vj0$7AN64" role="zNcA_">
        <node concept="AHUyw" id="2Vj0$7AN6h" role="Ayubk">
          <property role="TrG5h" value="glucose" />
        </node>
        <node concept="1gwEsf" id="2Vj0$7AN6F" role="1gwEsO">
          <node concept="7$aXd" id="2Vj0$7ANg_" role="1gwEsT">
            <property role="7cVD1" value="2Vj0$6Rt6X/MOL_PER_LITRE" />
            <node concept="1gwEsW" id="2Vj0$7ANgD" role="7$aXi">
              <property role="1gx9Cc" value="123" />
            </node>
          </node>
          <node concept="7$aXd" id="2Vj0$7ANgK" role="AGUp3">
            <property role="7cVD1" value="2Vj0$6Rt6X/MOL_PER_LITRE" />
            <node concept="1gwEsW" id="2Vj0$7ANh1" role="7$aXi">
              <property role="1gx9Cc" value="124" />
            </node>
          </node>
        </node>
      </node>
      <node concept="A_7WG" id="2Vj0$7AN69" role="A_7z5">
        <property role="A_7WF" value="dsa" />
      </node>
    </node>
    <node concept="3qq98I" id="4KU2bhgDtyk" role="3qq98H">
      <node concept="zNcxK" id="4KU2bhgDtyl" role="zNcA_">
        <node concept="1gwEsf" id="4KU2bhgDtyE" role="1gwEsO">
          <node concept="7$aXd" id="4KU2bhgDtyN" role="1gwEsT">
            <property role="7cVD1" value="2Vj0$6Rt6X/MOL_PER_LITRE" />
            <node concept="1gwEsW" id="4KU2bhgDtyR" role="7$aXi">
              <property role="1gx9Cc" value="123" />
            </node>
          </node>
          <node concept="7$aXd" id="4pgcSLYDOf8" role="AGUp3">
            <property role="7cVD1" value="2Vj0$6Rt6X/MOL_PER_LITRE" />
            <node concept="1gwEsW" id="4pgcSLYDOfc" role="7$aXi">
              <property role="1gx9Cc" value="321" />
            </node>
          </node>
        </node>
        <node concept="AHUyw" id="4KU2bhgDtyB" role="Ayubk">
          <property role="TrG5h" value="glucose" />
        </node>
      </node>
      <node concept="A_7WG" id="4KU2bhgDtyo" role="A_7z5">
        <property role="A_7WF" value="fda" />
      </node>
    </node>
    <node concept="3qrERO" id="2Vj0$6XOfb" role="3qrER8">
      <property role="3qrERf" value="2" />
      <property role="3qrERa" value="10" />
      <node concept="AHUyw" id="2Vj0$6XOff" role="1gBsvM">
        <property role="TrG5h" value="glucose" />
      </node>
    </node>
  </node>
  <node concept="6pDRa" id="2Vj0$6ZzRv">
    <property role="TrG5h" value="DefaultUnitConfig" />
    <node concept="6mXTH" id="2Vj0$6ZzRw" role="6mlHM">
      <property role="6mXTy" value="2Vj0$6RsW$/BEATS_PER_MINUTE" />
      <node concept="6nNFI" id="2Vj0$6ZzRy" role="6mXTG">
        <property role="TrG5h" value="pulse" />
      </node>
    </node>
    <node concept="6mXTH" id="2Vj0$6ZzRz" role="6mlHM">
      <property role="6mXTy" value="2Vj0$6RsWC/MERCURY_MM" />
      <node concept="1gAPBt" id="2Vj0$6ZzR_" role="6mXTG">
        <property role="TrG5h" value="blood pressure" />
      </node>
    </node>
    <node concept="6mXTH" id="2Vj0$6ZzRA" role="6mlHM">
      <property role="6mXTy" value="2Vj0$6Rt6X/MOL_PER_LITRE" />
      <node concept="AHUyw" id="2Vj0$6ZzRC" role="6mXTG">
        <property role="TrG5h" value="glucose" />
      </node>
    </node>
    <node concept="6mXTH" id="2Vj0$6ZzRD" role="6mlHM">
      <property role="6mXTy" value="2Vj0$6Rrv0/KILOGRAM" />
      <node concept="1gAPBp" id="2Vj0$6ZzRF" role="6mXTG">
        <property role="TrG5h" value="weight" />
      </node>
    </node>
    <node concept="6mXTH" id="2Vj0$6ZzRG" role="6mlHM">
      <property role="6mXTy" value="2Vj0$6RsWx/CELSIUS_DEGREE" />
      <node concept="6mddo" id="2Vj0$6ZzRI" role="6mXTG">
        <property role="TrG5h" value="temperature" />
      </node>
    </node>
  </node>
</model>

