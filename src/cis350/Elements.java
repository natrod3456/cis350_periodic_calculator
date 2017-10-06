package cis350;

public enum Elements {

	H(1,"Hydrogen",1.008),
	He(2, "Helium",4.0026),
	Li(3, "Lithium",6.94),
	Be(4, "Berylium",9.0122),
	B(5, "Boron",10.81),
	C(6, "Carbon",12.011),
	N(7, "Nitrogen",14.007),
	O(8, "Oxygen",15.999),
	F(9, "Florine",18.998),
	Ne(10, "Neon",20.180),
	Na(11, "Sodium",22.990),
	Mg(12, "Magnesium",24.305),
	Al(13, "Aluminum",26.982),
	Si(14, "Silicon",28.085),
	P(15, "Phosphorus",30.974),
	S(16, "Sulfur",32.06),
	Cl(17, "Chlorine",35.45),
	Ar(18, "Argon",39.948),
	K(19, "Potassium",39.098),
	Ca(20, "Calcium",40.078),
	Sc(21, "Scandium",44.956),
	Ti(22, "Titanium",47.867),
	V(23, "Vanadium",50.942),
	Cr(24, "Chromium",51.996),
	Mn(25, "Manganese",54.938),
	Fe(26, "Iron",55.996),
	Co(27, "Cobalt",58.933),
	Ni(28, "Nickel",58.693),
	Cu(29, "Copper",63.546),
	Zn(30, "Zinc",65.38),
	Ga(31, "Gallium",69.723),
	Ge(32, "Germanium",72.630),
	As(33, "Arsanic",74.922),
	Se(34, "Selanium",78.971),
	Br(35, "Bromine",79.904),
	Kr(36, "Krypton",83.798),
	Rb(37, "Rubidium",85.468),
	Sr(38, "Strontium",87.62),
	Y(39, "Yittrium",88.906),
	Zr(40, "Zirconium",91.224),
	Nb(41, "Niobium",92.906),
	Mo(42, "Molybdenum",95.95),
	Tc(43, "Technetium",98.91),
	Ru(44, "Ruthenium",101.07),
	Rh(45, "Rhodium",102.91),
	Pd(46, "Palladium",106.42),
	Ag(47, "Silver",107.87),
	Cd(48, "Cadmium",112.41),
	In(49, "Indium",114.82),
	Sn(50, "Tin",118.71),
	Sb(51, "Antimony",121.76),
	Te(52, "Tellurium",127.60),
	I(53, "Iodine",126.90),
	Xe(54, "Xenon",131.29),
	Cs(55, "Caesium",132.91),
	Ba(56, "Barium",137.33),
	La(57, "Lanthanum",138.91),
	Ce(58, "Cerium",140.12),
	Pr(59, "Praseodymium",140.91),
	Nd(60, "Neodymium",144.24),
	Pm(61, "Promethium",144.91),
	Sm(62, "Samarium",150.36),
	Eu(63, "Europium",151.96),
	Gd(64, "Gadolinium",157.25),
	Tb(65, "Terbium",158.93),
	Dy(66, "Dysprosium",162.50),
	Ho(67, "Holmium",164.93),
	Er(68, "Erbium",167.26),
	Tm(69, "Thumlium",168.93),
	Yb(70, "Ytterbium",173.05),
	Lu(71, "Lutetium",174.97),
	Hf(72, "Hafnium",178.49),
	Ta(73, "Tantalum",180.95),
	W(74, "Tungsten",183.84),
	Re(75, "Rhenium",186.21),
	Os(76, "Osmium",190.23),
	Ir(77, "Iridium",192.22),
	Pt(78, "Platinum",195.08),
	Au(79, "Gold",196.97),
	Hg(80, "Mercury",200.59),
	Tl(81, "Thallium",204.38),
	Pb(82, "Lead",207.2),
	Bi(83, "Bismuth",208.98),
	Po(84, "Polonium",208.98),
	At(85, "Astatin",209.98),
	Rn(86, "Radon",222.02),
	Fr(87, "Francium",223.02),
	Ra(88, "Radium",226.03),
	Ac(89, "Actinium",227.03),
	Th(90, "Thorium",232.04),
	Pa(91, "Protactinium",231.04),
	U(92, "Uranium",238.03),
	Np(93, "Neptunium",237.05),
	Pu(94, "Plutonium",244.06),
	Am(95, "Amercium",243.06),
	Cm(96, "Curium",247.07),
	Bk(97, "Berkelium",247.07),
	Cf(98, "Californium",251.08),
	Es(99, "Einsteinium",254.0),
	Fm(100, "Fermium",257.10),
	Md(101, "Mendelevium",258.10),
	No(102, "Nobelium",259.10),
	Lr(103, "Lawrencium",262.0),
	Rf(104, "Rutherfordium",261.0),
	Db(105, "Dubnium",262.0),
	Sg(106, "Seaborgium",266.0),
	Bh(107, "Bohrium",264.0),
	Hs(108, "Hassium",269.0),
	Mt(109, "Meitnerium",268.0),
	Ds(110, "Damstadium",269.0),
	Rg(111, "Roentgerium",272.0),
	Uub(112, "Ununbium",285.0),
	Uut(113, "Ununtrium",286.0),
	Uuq(114, "Ununquadium",289.0),
	Uup(115, "Ununpentium",290.0),
	Uuh(116, "Ununhexium",293.0),
	Uus(117, "Ununseptium",294.0),
	Uuo(118, "Ununoctium",294.0);
	
	
	
	
	
	
	
	
	
	
	private final Integer atomicNumber;
	private final Double atomicWeight;
	private final String name;
	
	Elements(Integer number, String formalName, Double weight){
		atomicNumber = number;
		name = formalName;
		atomicWeight = weight;
	}

	public Integer getAtomicNumber() {
		return atomicNumber;
	}
	
	public Double getAtomicWeight() {
		return atomicWeight;
	}
	
	public String getName() {
		return name;
	}
	
}

