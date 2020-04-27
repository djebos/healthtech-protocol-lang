package healthtech.actions;

/*Generated by MPS */

import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class measurementUnitConfig {
  public static class NodeFactory_52719422299715692 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      SPropertyOperations.assign(newNode, PROPS.name$tAp1, "DefaultUnitConfig");
      SNode pulse = SNodeFactoryOperations.createNewNode(CONCEPTS.MeasurementType2UnitMapping$8q, null);
      SLinkOperations.setTarget(pulse, LINKS.type$f5j0, SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906e476e7L, "healthtech.structure.PulseMeasurement")));
      SPropertyOperations.assignEnum(pulse, PROPS.unit$f5w5, SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906ddb7bfL, "healthtech.structure.MeasurementUnit"), 0xbb4c0906ddcf24L, "BEATS_PER_MINUTE"));

      SNode pressure = SNodeFactoryOperations.createNewNode(CONCEPTS.MeasurementType2UnitMapping$8q, null);
      SLinkOperations.setTarget(pressure, LINKS.type$f5j0, SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x3d41ce506dda978dL, "healthtech.structure.BloodPressureMeasurement")));
      SPropertyOperations.assignEnum(pressure, PROPS.unit$f5w5, SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906ddb7bfL, "healthtech.structure.MeasurementUnit"), 0xbb4c0906ddcf28L, "MERCURY_MM"));

      SNode glucose = SNodeFactoryOperations.createNewNode(CONCEPTS.MeasurementType2UnitMapping$8q, null);
      SLinkOperations.setTarget(glucose, LINKS.type$f5j0, SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x1f38b4c7398f1c67L, "healthtech.structure.GlucoseMeasurement")));
      SPropertyOperations.assignEnum(glucose, PROPS.unit$f5w5, SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906ddb7bfL, "healthtech.structure.MeasurementUnit"), 0xbb4c0906ddd1bdL, "MOL_PER_LITRE"));

      SNode weight = SNodeFactoryOperations.createNewNode(CONCEPTS.MeasurementType2UnitMapping$8q, null);
      SLinkOperations.setTarget(weight, LINKS.type$f5j0, SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x3d41ce506dda9789L, "healthtech.structure.WeightMeasurement")));
      SPropertyOperations.assignEnum(weight, PROPS.unit$f5w5, SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906ddb7bfL, "healthtech.structure.MeasurementUnit"), 0xbb4c0906ddb7c0L, "KILOGRAM"));

      SNode temp = SNodeFactoryOperations.createNewNode(CONCEPTS.MeasurementType2UnitMapping$8q, null);
      SLinkOperations.setTarget(temp, LINKS.type$f5j0, SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906e39f51L, "healthtech.structure.TemperatureMeasurement")));
      SPropertyOperations.assignEnum(temp, PROPS.unit$f5w5, SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906ddb7bfL, "healthtech.structure.MeasurementUnit"), 0xbb4c0906ddcf21L, "CELSIUS_DEGREE"));

      ListSequence.fromList(SLinkOperations.getChildren(newNode, LINKS.mappings$JWDo)).addElement(pulse);
      ListSequence.fromList(SLinkOperations.getChildren(newNode, LINKS.mappings$JWDo)).addElement(pressure);
      ListSequence.fromList(SLinkOperations.getChildren(newNode, LINKS.mappings$JWDo)).addElement(glucose);
      ListSequence.fromList(SLinkOperations.getChildren(newNode, LINKS.mappings$JWDo)).addElement(weight);
      ListSequence.fromList(SLinkOperations.getChildren(newNode, LINKS.mappings$JWDo)).addElement(temp);

    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$tAp1 = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty unit$f5w5 = MetaAdapterFactory.getProperty(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906e09264L, 0xbb4c0906e0926bL, "unit");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept MeasurementType2UnitMapping$8q = MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906e09264L, "healthtech.structure.MeasurementType2UnitMapping");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink type$f5j0 = MetaAdapterFactory.getContainmentLink(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906e09264L, 0xbb4c0906e09265L, "type");
    /*package*/ static final SContainmentLink mappings$JWDo = MetaAdapterFactory.getContainmentLink(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0xbb4c0906ddd1c3L, 0xbb4c0906e2177bL, "mappings");
  }
}
