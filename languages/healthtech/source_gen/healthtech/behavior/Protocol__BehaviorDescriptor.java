package healthtech.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.scope.FilteringScope;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SProperty;

public final class Protocol__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x41ac8d399bc1bfe2L, "healthtech.structure.Protocol");

  public static final SMethod<Scope> getScope_id52_Geb4QDV$ = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("52_Geb4QDV$").build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getScope_id52_Geb4QDV$);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static Scope getScope_id52_Geb4QDV$(@NotNull SNode __thisNode__, SAbstractConcept kind, SNode child) {
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(kind), CONCEPTS.Measurement$Hi)) {
      Iterable<SNode> measurements = ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, LINKS.inputSpecs$6ijH)).select(new ISelector<SNode, SNode>() {
        public SNode select(SNode it) {
          return SLinkOperations.getTarget(it, LINKS.measure$duPR);
        }
      });
      List<SNode> array = Sequence.fromIterable(measurements).toListSequence();
      if (Sequence.fromIterable(measurements).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SConceptOperations.isExactly(SNodeOperations.asSConcept(SNodeOperations.getConcept(it)), CONCEPTS.BloodPressureMeasurement$TS);
        }
      })) {
        ListSequence.fromList(array).addElement(SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x3d41ce506dda9794L, "healthtech.structure.DiastolicPressueMeasurement")));
        ListSequence.fromList(array).addElement(SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x3d41ce506dda9795L, "healthtech.structure.SystolicPressureMeasurement")));
      }
      return new FilteringScope(new ListScope(array) {
        @Override
        public String getName(SNode child) {
          return SPropertyOperations.getString(SNodeOperations.cast(child, CONCEPTS.Measurement$Hi), PROPS.name$tAp1);
        }
      }) {
        @Override
        public boolean isExcluded(SNode node) {
          return SConceptOperations.isExactly(SNodeOperations.asSConcept(SNodeOperations.getConcept(node)), CONCEPTS.BloodPressureMeasurement$TS);
        }
      };

    }
    return null;
  }

  /*package*/ Protocol__BehaviorDescriptor() {
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((Scope) getScope_id52_Geb4QDV$(node, (SAbstractConcept) parameters[0], (SNode) parameters[1]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Measurement$Hi = MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x3d41ce506dda9788L, "healthtech.structure.Measurement");
    /*package*/ static final SConcept BloodPressureMeasurement$TS = MetaAdapterFactory.getConcept(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x3d41ce506dda978dL, "healthtech.structure.BloodPressureMeasurement");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink inputSpecs$6ijH = MetaAdapterFactory.getContainmentLink(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x41ac8d399bc1bfe2L, 0x41ac8d399bc220f1L, "inputSpecs");
    /*package*/ static final SContainmentLink measure$duPR = MetaAdapterFactory.getContainmentLink(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x41ac8d399bc220cdL, 0x3d41ce506ddc09a2L, "measure");
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$tAp1 = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }
}
