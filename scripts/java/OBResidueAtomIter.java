/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBResidueAtomIter {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OBResidueAtomIter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBResidueAtomIter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBResidueAtomIter(swigCPtr);
    }
    swigCPtr = 0;
  }

  public OBResidueAtomIter() {
    this(openbabelJNI.new_OBResidueAtomIter__SWIG_0(), true);
  }

  public OBResidueAtomIter(OBResidue res) {
    this(openbabelJNI.new_OBResidueAtomIter__SWIG_1(OBResidue.getCPtr(res), res), true);
  }

  public OBResidueAtomIter(OBResidueAtomIter ri) {
    this(openbabelJNI.new_OBResidueAtomIter__SWIG_2(OBResidueAtomIter.getCPtr(ri), ri), true);
  }

  public OBAtom __deref__() {
    long cPtr = openbabelJNI.OBResidueAtomIter___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBAtom __ref__() {
    return new OBAtom(openbabelJNI.OBResidueAtomIter___ref__(swigCPtr, this), false);
  }

  public void setVisit(boolean value) {
    openbabelJNI.OBResidueAtomIter_Visit_set(swigCPtr, this, value);
  }

  public boolean getVisit() {
    return openbabelJNI.OBResidueAtomIter_Visit_get(swigCPtr, this);
  }

  public boolean Clear() {
    return openbabelJNI.OBResidueAtomIter_Clear(swigCPtr, this);
  }

  public void SetIdx(int idx) {
    openbabelJNI.OBResidueAtomIter_SetIdx(swigCPtr, this, idx);
  }

  public void SetHyb(int hyb) {
    openbabelJNI.OBResidueAtomIter_SetHyb(swigCPtr, this, hyb);
  }

  public void SetAtomicNum(int atomicnum) {
    openbabelJNI.OBResidueAtomIter_SetAtomicNum(swigCPtr, this, atomicnum);
  }

  public void SetIsotope(long iso) {
    openbabelJNI.OBResidueAtomIter_SetIsotope(swigCPtr, this, iso);
  }

  public void SetImplicitValence(int val) {
    openbabelJNI.OBResidueAtomIter_SetImplicitValence(swigCPtr, this, val);
  }

  public void IncrementImplicitValence() {
    openbabelJNI.OBResidueAtomIter_IncrementImplicitValence(swigCPtr, this);
  }

  public void DecrementImplicitValence() {
    openbabelJNI.OBResidueAtomIter_DecrementImplicitValence(swigCPtr, this);
  }

  public void SetFormalCharge(int fcharge) {
    openbabelJNI.OBResidueAtomIter_SetFormalCharge(swigCPtr, this, fcharge);
  }

  public void SetSpinMultiplicity(short spin) {
    openbabelJNI.OBResidueAtomIter_SetSpinMultiplicity(swigCPtr, this, spin);
  }

  public void SetType(String type) {
    openbabelJNI.OBResidueAtomIter_SetType__SWIG_0(swigCPtr, this, type);
  }

  public void SetType(SWIGTYPE_p_std__string type) {
    openbabelJNI.OBResidueAtomIter_SetType__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(type));
  }

  public void SetPartialCharge(double pcharge) {
    openbabelJNI.OBResidueAtomIter_SetPartialCharge(swigCPtr, this, pcharge);
  }

  public void SetVector(vector3 v) {
    openbabelJNI.OBResidueAtomIter_SetVector__SWIG_0(swigCPtr, this, vector3.getCPtr(v), v);
  }

  public void SetVector(double x, double y, double z) {
    openbabelJNI.OBResidueAtomIter_SetVector__SWIG_1(swigCPtr, this, x, y, z);
  }

  public void SetVector() {
    openbabelJNI.OBResidueAtomIter_SetVector__SWIG_2(swigCPtr, this);
  }

  public void SetCoordPtr(SWIGTYPE_p_p_double c) {
    openbabelJNI.OBResidueAtomIter_SetCoordPtr(swigCPtr, this, SWIGTYPE_p_p_double.getCPtr(c));
  }

  public void SetResidue(OBResidue res) {
    openbabelJNI.OBResidueAtomIter_SetResidue(swigCPtr, this, OBResidue.getCPtr(res), res);
  }

  public void SetParent(OBMol ptr) {
    openbabelJNI.OBResidueAtomIter_SetParent(swigCPtr, this, OBMol.getCPtr(ptr), ptr);
  }

  public void SetAromatic() {
    openbabelJNI.OBResidueAtomIter_SetAromatic(swigCPtr, this);
  }

  public void UnsetAromatic() {
    openbabelJNI.OBResidueAtomIter_UnsetAromatic(swigCPtr, this);
  }

  public void SetClockwiseStereo() {
    openbabelJNI.OBResidueAtomIter_SetClockwiseStereo(swigCPtr, this);
  }

  public void SetAntiClockwiseStereo() {
    openbabelJNI.OBResidueAtomIter_SetAntiClockwiseStereo(swigCPtr, this);
  }

  public void SetPositiveStereo() {
    openbabelJNI.OBResidueAtomIter_SetPositiveStereo(swigCPtr, this);
  }

  public void SetNegativeStereo() {
    openbabelJNI.OBResidueAtomIter_SetNegativeStereo(swigCPtr, this);
  }

  public void UnsetStereo() {
    openbabelJNI.OBResidueAtomIter_UnsetStereo(swigCPtr, this);
  }

  public void SetInRing() {
    openbabelJNI.OBResidueAtomIter_SetInRing(swigCPtr, this);
  }

  public void SetChiral() {
    openbabelJNI.OBResidueAtomIter_SetChiral(swigCPtr, this);
  }

  public void ClearCoordPtr() {
    openbabelJNI.OBResidueAtomIter_ClearCoordPtr(swigCPtr, this);
  }

  public int GetFormalCharge() {
    return openbabelJNI.OBResidueAtomIter_GetFormalCharge(swigCPtr, this);
  }

  public long GetAtomicNum() {
    return openbabelJNI.OBResidueAtomIter_GetAtomicNum(swigCPtr, this);
  }

  public int GetIsotope() {
    return openbabelJNI.OBResidueAtomIter_GetIsotope(swigCPtr, this);
  }

  public int GetSpinMultiplicity() {
    return openbabelJNI.OBResidueAtomIter_GetSpinMultiplicity(swigCPtr, this);
  }

  public double GetAtomicMass() {
    return openbabelJNI.OBResidueAtomIter_GetAtomicMass(swigCPtr, this);
  }

  public double GetExactMass() {
    return openbabelJNI.OBResidueAtomIter_GetExactMass(swigCPtr, this);
  }

  public long GetIdx() {
    return openbabelJNI.OBResidueAtomIter_GetIdx(swigCPtr, this);
  }

  public long GetCoordinateIdx() {
    return openbabelJNI.OBResidueAtomIter_GetCoordinateIdx(swigCPtr, this);
  }

  public long GetCIdx() {
    return openbabelJNI.OBResidueAtomIter_GetCIdx(swigCPtr, this);
  }

  public long GetValence() {
    return openbabelJNI.OBResidueAtomIter_GetValence(swigCPtr, this);
  }

  public long GetHyb() {
    return openbabelJNI.OBResidueAtomIter_GetHyb(swigCPtr, this);
  }

  public long GetImplicitValence() {
    return openbabelJNI.OBResidueAtomIter_GetImplicitValence(swigCPtr, this);
  }

  public long GetHvyValence() {
    return openbabelJNI.OBResidueAtomIter_GetHvyValence(swigCPtr, this);
  }

  public long GetHeteroValence() {
    return openbabelJNI.OBResidueAtomIter_GetHeteroValence(swigCPtr, this);
  }

  public String GetType() {
    return openbabelJNI.OBResidueAtomIter_GetType(swigCPtr, this);
  }

  public double GetX() {
    return openbabelJNI.OBResidueAtomIter_GetX(swigCPtr, this);
  }

  public double GetY() {
    return openbabelJNI.OBResidueAtomIter_GetY(swigCPtr, this);
  }

  public double GetZ() {
    return openbabelJNI.OBResidueAtomIter_GetZ(swigCPtr, this);
  }

  public double x() {
    return openbabelJNI.OBResidueAtomIter_x(swigCPtr, this);
  }

  public double y() {
    return openbabelJNI.OBResidueAtomIter_y(swigCPtr, this);
  }

  public double z() {
    return openbabelJNI.OBResidueAtomIter_z(swigCPtr, this);
  }

  public SWIGTYPE_p_double GetCoordinate() {
    long cPtr = openbabelJNI.OBResidueAtomIter_GetCoordinate(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public vector3 GetVector() {
    return new vector3(openbabelJNI.OBResidueAtomIter_GetVector__SWIG_0(swigCPtr, this), false);
  }

  public double GetPartialCharge() {
    return openbabelJNI.OBResidueAtomIter_GetPartialCharge(swigCPtr, this);
  }

  public OBResidue GetResidue() {
    long cPtr = openbabelJNI.OBResidueAtomIter_GetResidue(swigCPtr, this);
    return (cPtr == 0) ? null : new OBResidue(cPtr, false);
  }

  public OBMol GetParent() {
    long cPtr = openbabelJNI.OBResidueAtomIter_GetParent(swigCPtr, this);
    return (cPtr == 0) ? null : new OBMol(cPtr, false);
  }

  public boolean GetNewBondVector(vector3 v, double length) {
    return openbabelJNI.OBResidueAtomIter_GetNewBondVector(swigCPtr, this, vector3.getCPtr(v), v, length);
  }

  public OBBond GetBond(OBAtom arg0) {
    long cPtr = openbabelJNI.OBResidueAtomIter_GetBond(swigCPtr, this, OBAtom.getCPtr(arg0), arg0);
    return (cPtr == 0) ? null : new OBBond(cPtr, false);
  }

  public OBAtom GetNextAtom() {
    long cPtr = openbabelJNI.OBResidueAtomIter_GetNextAtom(swigCPtr, this);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator BeginBonds() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator(openbabelJNI.OBResidueAtomIter_BeginBonds(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator EndBonds() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator(openbabelJNI.OBResidueAtomIter_EndBonds(swigCPtr, this), true);
  }

  public OBBond BeginBond(SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator i) {
    long cPtr = openbabelJNI.OBResidueAtomIter_BeginBond(swigCPtr, this, SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator.getCPtr(i));
    return (cPtr == 0) ? null : new OBBond(cPtr, false);
  }

  public OBBond NextBond(SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator i) {
    long cPtr = openbabelJNI.OBResidueAtomIter_NextBond(swigCPtr, this, SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator.getCPtr(i));
    return (cPtr == 0) ? null : new OBBond(cPtr, false);
  }

  public OBAtom BeginNbrAtom(SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator i) {
    long cPtr = openbabelJNI.OBResidueAtomIter_BeginNbrAtom(swigCPtr, this, SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator.getCPtr(i));
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBAtom NextNbrAtom(SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator i) {
    long cPtr = openbabelJNI.OBResidueAtomIter_NextNbrAtom(swigCPtr, this, SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator.getCPtr(i));
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public double GetDistance(int index) {
    return openbabelJNI.OBResidueAtomIter_GetDistance__SWIG_0(swigCPtr, this, index);
  }

  public double GetDistance(OBAtom arg0) {
    return openbabelJNI.OBResidueAtomIter_GetDistance__SWIG_1(swigCPtr, this, OBAtom.getCPtr(arg0), arg0);
  }

  public double GetAngle(int b, int c) {
    return openbabelJNI.OBResidueAtomIter_GetAngle__SWIG_0(swigCPtr, this, b, c);
  }

  public double GetAngle(OBAtom b, OBAtom c) {
    return openbabelJNI.OBResidueAtomIter_GetAngle__SWIG_1(swigCPtr, this, OBAtom.getCPtr(b), b, OBAtom.getCPtr(c), c);
  }

  public void NewResidue() {
    openbabelJNI.OBResidueAtomIter_NewResidue(swigCPtr, this);
  }

  public void AddResidue(OBResidue res) {
    openbabelJNI.OBResidueAtomIter_AddResidue(swigCPtr, this, OBResidue.getCPtr(res), res);
  }

  public void DeleteResidue() {
    openbabelJNI.OBResidueAtomIter_DeleteResidue(swigCPtr, this);
  }

  public void AddBond(OBBond bond) {
    openbabelJNI.OBResidueAtomIter_AddBond(swigCPtr, this, OBBond.getCPtr(bond), bond);
  }

  public void InsertBond(SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator i, OBBond bond) {
    openbabelJNI.OBResidueAtomIter_InsertBond(swigCPtr, this, SWIGTYPE_p_std__vectorTOpenBabel__OBBond_p_t__iterator.getCPtr(i), OBBond.getCPtr(bond), bond);
  }

  public boolean DeleteBond(OBBond bond) {
    return openbabelJNI.OBResidueAtomIter_DeleteBond(swigCPtr, this, OBBond.getCPtr(bond), bond);
  }

  public void ClearBond() {
    openbabelJNI.OBResidueAtomIter_ClearBond(swigCPtr, this);
  }

  public boolean HtoMethyl() {
    return openbabelJNI.OBResidueAtomIter_HtoMethyl(swigCPtr, this);
  }

  public boolean SetHybAndGeom(int arg0) {
    return openbabelJNI.OBResidueAtomIter_SetHybAndGeom(swigCPtr, this, arg0);
  }

  public void ForceNoH() {
    openbabelJNI.OBResidueAtomIter_ForceNoH(swigCPtr, this);
  }

  public boolean HasNoHForced() {
    return openbabelJNI.OBResidueAtomIter_HasNoHForced(swigCPtr, this);
  }

  public long CountFreeOxygens() {
    return openbabelJNI.OBResidueAtomIter_CountFreeOxygens(swigCPtr, this);
  }

  public long ImplicitHydrogenCount() {
    return openbabelJNI.OBResidueAtomIter_ImplicitHydrogenCount(swigCPtr, this);
  }

  public long ExplicitHydrogenCount(boolean ExcludeIsotopes) {
    return openbabelJNI.OBResidueAtomIter_ExplicitHydrogenCount__SWIG_0(swigCPtr, this, ExcludeIsotopes);
  }

  public long ExplicitHydrogenCount() {
    return openbabelJNI.OBResidueAtomIter_ExplicitHydrogenCount__SWIG_1(swigCPtr, this);
  }

  public long MemberOfRingCount() {
    return openbabelJNI.OBResidueAtomIter_MemberOfRingCount(swigCPtr, this);
  }

  public long MemberOfRingSize() {
    return openbabelJNI.OBResidueAtomIter_MemberOfRingSize(swigCPtr, this);
  }

  public long CountRingBonds() {
    return openbabelJNI.OBResidueAtomIter_CountRingBonds(swigCPtr, this);
  }

  public double SmallestBondAngle() {
    return openbabelJNI.OBResidueAtomIter_SmallestBondAngle(swigCPtr, this);
  }

  public double AverageBondAngle() {
    return openbabelJNI.OBResidueAtomIter_AverageBondAngle(swigCPtr, this);
  }

  public long BOSum() {
    return openbabelJNI.OBResidueAtomIter_BOSum(swigCPtr, this);
  }

  public long KBOSum() {
    return openbabelJNI.OBResidueAtomIter_KBOSum(swigCPtr, this);
  }

  public boolean HasResidue() {
    return openbabelJNI.OBResidueAtomIter_HasResidue(swigCPtr, this);
  }

  public boolean IsHydrogen() {
    return openbabelJNI.OBResidueAtomIter_IsHydrogen(swigCPtr, this);
  }

  public boolean IsCarbon() {
    return openbabelJNI.OBResidueAtomIter_IsCarbon(swigCPtr, this);
  }

  public boolean IsNitrogen() {
    return openbabelJNI.OBResidueAtomIter_IsNitrogen(swigCPtr, this);
  }

  public boolean IsOxygen() {
    return openbabelJNI.OBResidueAtomIter_IsOxygen(swigCPtr, this);
  }

  public boolean IsSulfur() {
    return openbabelJNI.OBResidueAtomIter_IsSulfur(swigCPtr, this);
  }

  public boolean IsPhosphorus() {
    return openbabelJNI.OBResidueAtomIter_IsPhosphorus(swigCPtr, this);
  }

  public boolean IsAromatic() {
    return openbabelJNI.OBResidueAtomIter_IsAromatic(swigCPtr, this);
  }

  public boolean IsInRing() {
    return openbabelJNI.OBResidueAtomIter_IsInRing(swigCPtr, this);
  }

  public boolean IsInRingSize(int arg0) {
    return openbabelJNI.OBResidueAtomIter_IsInRingSize(swigCPtr, this, arg0);
  }

  public boolean IsHeteroatom() {
    return openbabelJNI.OBResidueAtomIter_IsHeteroatom(swigCPtr, this);
  }

  public boolean IsNotCorH() {
    return openbabelJNI.OBResidueAtomIter_IsNotCorH(swigCPtr, this);
  }

  public boolean IsConnected(OBAtom arg0) {
    return openbabelJNI.OBResidueAtomIter_IsConnected(swigCPtr, this, OBAtom.getCPtr(arg0), arg0);
  }

  public boolean IsOneThree(OBAtom arg0) {
    return openbabelJNI.OBResidueAtomIter_IsOneThree(swigCPtr, this, OBAtom.getCPtr(arg0), arg0);
  }

  public boolean IsOneFour(OBAtom arg0) {
    return openbabelJNI.OBResidueAtomIter_IsOneFour(swigCPtr, this, OBAtom.getCPtr(arg0), arg0);
  }

  public boolean IsCarboxylOxygen() {
    return openbabelJNI.OBResidueAtomIter_IsCarboxylOxygen(swigCPtr, this);
  }

  public boolean IsPhosphateOxygen() {
    return openbabelJNI.OBResidueAtomIter_IsPhosphateOxygen(swigCPtr, this);
  }

  public boolean IsSulfateOxygen() {
    return openbabelJNI.OBResidueAtomIter_IsSulfateOxygen(swigCPtr, this);
  }

  public boolean IsNitroOxygen() {
    return openbabelJNI.OBResidueAtomIter_IsNitroOxygen(swigCPtr, this);
  }

  public boolean IsAmideNitrogen() {
    return openbabelJNI.OBResidueAtomIter_IsAmideNitrogen(swigCPtr, this);
  }

  public boolean IsPolarHydrogen() {
    return openbabelJNI.OBResidueAtomIter_IsPolarHydrogen(swigCPtr, this);
  }

  public boolean IsNonPolarHydrogen() {
    return openbabelJNI.OBResidueAtomIter_IsNonPolarHydrogen(swigCPtr, this);
  }

  public boolean IsAromaticNOxide() {
    return openbabelJNI.OBResidueAtomIter_IsAromaticNOxide(swigCPtr, this);
  }

  public boolean IsChiral() {
    return openbabelJNI.OBResidueAtomIter_IsChiral(swigCPtr, this);
  }

  public boolean IsAxial() {
    return openbabelJNI.OBResidueAtomIter_IsAxial(swigCPtr, this);
  }

  public boolean IsClockwise() {
    return openbabelJNI.OBResidueAtomIter_IsClockwise(swigCPtr, this);
  }

  public boolean IsAntiClockwise() {
    return openbabelJNI.OBResidueAtomIter_IsAntiClockwise(swigCPtr, this);
  }

  public boolean IsPositiveStereo() {
    return openbabelJNI.OBResidueAtomIter_IsPositiveStereo(swigCPtr, this);
  }

  public boolean IsNegativeStereo() {
    return openbabelJNI.OBResidueAtomIter_IsNegativeStereo(swigCPtr, this);
  }

  public boolean HasChiralitySpecified() {
    return openbabelJNI.OBResidueAtomIter_HasChiralitySpecified(swigCPtr, this);
  }

  public boolean HasChiralVolume() {
    return openbabelJNI.OBResidueAtomIter_HasChiralVolume(swigCPtr, this);
  }

  public boolean IsHbondAcceptor() {
    return openbabelJNI.OBResidueAtomIter_IsHbondAcceptor(swigCPtr, this);
  }

  public boolean IsHbondDonor() {
    return openbabelJNI.OBResidueAtomIter_IsHbondDonor(swigCPtr, this);
  }

  public boolean IsHbondDonorH() {
    return openbabelJNI.OBResidueAtomIter_IsHbondDonorH(swigCPtr, this);
  }

  public boolean HasAlphaBetaUnsat(boolean includePandS) {
    return openbabelJNI.OBResidueAtomIter_HasAlphaBetaUnsat__SWIG_0(swigCPtr, this, includePandS);
  }

  public boolean HasAlphaBetaUnsat() {
    return openbabelJNI.OBResidueAtomIter_HasAlphaBetaUnsat__SWIG_1(swigCPtr, this);
  }

  public boolean HasBondOfOrder(long bo) {
    return openbabelJNI.OBResidueAtomIter_HasBondOfOrder(swigCPtr, this, bo);
  }

  public int CountBondsOfOrder(long bo) {
    return openbabelJNI.OBResidueAtomIter_CountBondsOfOrder(swigCPtr, this, bo);
  }

  public boolean HasNonSingleBond() {
    return openbabelJNI.OBResidueAtomIter_HasNonSingleBond(swigCPtr, this);
  }

  public boolean HasSingleBond() {
    return openbabelJNI.OBResidueAtomIter_HasSingleBond(swigCPtr, this);
  }

  public boolean HasDoubleBond() {
    return openbabelJNI.OBResidueAtomIter_HasDoubleBond(swigCPtr, this);
  }

  public boolean HasAromaticBond() {
    return openbabelJNI.OBResidueAtomIter_HasAromaticBond(swigCPtr, this);
  }

  public boolean MatchesSMARTS(String arg0) {
    return openbabelJNI.OBResidueAtomIter_MatchesSMARTS(swigCPtr, this, arg0);
  }

  public OBBase DoTransformations(SWIGTYPE_p_std__mapTstd__string_std__string_t arg0) {
    long cPtr = openbabelJNI.OBResidueAtomIter_DoTransformations(swigCPtr, this, SWIGTYPE_p_std__mapTstd__string_std__string_t.getCPtr(arg0));
    return (cPtr == 0) ? null : new OBBase(cPtr, false);
  }

  public String ClassDescription() {
    return openbabelJNI.OBResidueAtomIter_ClassDescription(swigCPtr, this);
  }

  public boolean HasData(long type) {
    return openbabelJNI.OBResidueAtomIter_HasData__SWIG_2(swigCPtr, this, type);
  }

  public void DeleteData(long type) {
    openbabelJNI.OBResidueAtomIter_DeleteData__SWIG_0(swigCPtr, this, type);
  }

  public void DeleteData(OBGenericData arg0) {
    openbabelJNI.OBResidueAtomIter_DeleteData__SWIG_1(swigCPtr, this, OBGenericData.getCPtr(arg0), arg0);
  }

  public void DeleteData(vectorData arg0) {
    openbabelJNI.OBResidueAtomIter_DeleteData__SWIG_2(swigCPtr, this, vectorData.getCPtr(arg0), arg0);
  }

  public void SetData(OBGenericData d) {
    openbabelJNI.OBResidueAtomIter_SetData(swigCPtr, this, OBGenericData.getCPtr(d), d);
  }

  public long DataSize() {
    return openbabelJNI.OBResidueAtomIter_DataSize(swigCPtr, this);
  }

  public OBGenericData GetData(long type) {
    long cPtr = openbabelJNI.OBResidueAtomIter_GetData__SWIG_0(swigCPtr, this, type);
    return (cPtr == 0) ? null : new OBGenericData(cPtr, false);
  }

  public vectorData GetData() {
    return new vectorData(openbabelJNI.OBResidueAtomIter_GetData__SWIG_3(swigCPtr, this), false);
  }

  public vectorData GetData(DataOrigin source) {
    return new vectorData(openbabelJNI.OBResidueAtomIter_GetData__SWIG_4(swigCPtr, this, source.swigValue()), true);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator BeginData() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator(openbabelJNI.OBResidueAtomIter_BeginData(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator EndData() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator(openbabelJNI.OBResidueAtomIter_EndData(swigCPtr, this), true);
  }

}
