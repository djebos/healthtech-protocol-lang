package healthtech.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_OutputStatusEnum extends EnumerationDescriptorBase {

  public EnumerationDescriptor_OutputStatusEnum() {
    super(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x6c0fdc58b27e8d0eL, "OutputStatusEnum", "r:f9a5d9b0-e4d1-425f-bdda-6234399d7263(healthtech.structure)/7786684554256747790");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_GOOD_0 = new EnumerationDescriptor.MemberDescriptor("GOOD", "Good", 0x6c0fdc58b27e8d0fL, "r:f9a5d9b0-e4d1-425f-bdda-6234399d7263(healthtech.structure)/7786684554256747791");
  private final EnumerationDescriptor.MemberDescriptor myMember_NORMAL_0 = new EnumerationDescriptor.MemberDescriptor("NORMAL", "Normal", 0x6c0fdc58b27e8d10L, "r:f9a5d9b0-e4d1-425f-bdda-6234399d7263(healthtech.structure)/7786684554256747792");
  private final EnumerationDescriptor.MemberDescriptor myMember_CHECK_RISK_FACTORS_0 = new EnumerationDescriptor.MemberDescriptor("CHECK_RISK_FACTORS", "Check risk factors", 0x6c0fdc58b27e8d13L, "r:f9a5d9b0-e4d1-425f-bdda-6234399d7263(healthtech.structure)/7786684554256747795");
  private final EnumerationDescriptor.MemberDescriptor myMember_ASK_MEDICAL_HELP_0 = new EnumerationDescriptor.MemberDescriptor("ASK_MEDICAL_HELP", "Ask for Medical Help", 0x6c0fdc58b27e8d17L, "r:f9a5d9b0-e4d1-425f-bdda-6234399d7263(healthtech.structure)/7786684554256747799");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x302f6a2f71494d75L, 0x8daf01fecbeaf5d3L, 0x6c0fdc58b27e8d0eL, 0x6c0fdc58b27e8d0fL, 0x6c0fdc58b27e8d10L, 0x6c0fdc58b27e8d13L, 0x6c0fdc58b27e8d17L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_GOOD_0, myMember_NORMAL_0, myMember_CHECK_RISK_FACTORS_0, myMember_ASK_MEDICAL_HELP_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return null;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "GOOD":
        return myMember_GOOD_0;
      case "NORMAL":
        return myMember_NORMAL_0;
      case "CHECK_RISK_FACTORS":
        return myMember_CHECK_RISK_FACTORS_0;
      case "ASK_MEDICAL_HELP":
        return myMember_ASK_MEDICAL_HELP_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
