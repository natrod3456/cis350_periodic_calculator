package cis350;

import javax.swing.ImageIcon;

public enum Elements {

	H(1,"Hydrogen",1.008, "src/E1.png"),
	He(2, "Helium",4.0026, "src/E2.png"),
	Li(3, "Lithium",6.94, "src/E3.png"),
	Be(4, "Berylium",9.0122, "src/E4.png"),
	B(5, "Boron",10.81, "src/E5.png"),
	C(6, "Carbon",12.011, "src/E6.png"),
	N(7, "Nitrogen",14.007, "src/E7.png"),
	O(8, "Oxygen",15.999, "src/E8.png"),
	F(9, "Florine",18.998, "src/E9.png"),
	Ne(10, "Neon",20.180, "src/E10.png"),
	Na(11, "Sodium",22.990, "src/E11.png"),
	Mg(12, "Magnesium",24.305, "src/E12.png"),
	Al(13, "Aluminum",26.982, "src/E13.png"),
	Si(14, "Silicon",28.085, "src/E14.png"),
	P(15, "Phosphorus",30.974, "src/E15.png"),
	S(16, "Sulfur",32.06, "src/E16.png"),
	Cl(17, "Chlorine",35.45, "src/E17.png"),
	Ar(18, "Argon",39.948, "src/E18.png"),
	K(19, "Potassium",39.098, "src/E19.png"),
	Ca(20, "Calcium",40.078, "src/E20.png"),
	Sc(21, "Scandium",44.956, "src/E21.png"),
	Ti(22, "Titanium",47.867, "src/E22.png"),
	V(23, "Vanadium",50.942, "src/E23.png"),
	Cr(24, "Chromium",51.996, "src/E24.png"),
	Mn(25, "Manganese",54.938, "src/E25.png"),
	Fe(26, "Iron",55.996, "src/E26.png"),
	Co(27, "Cobalt",58.933, "src/E27.png"),
	Ni(28, "Nickel",58.693, "src/E28.png"),
	Cu(29, "Copper",63.546, "src/E29.png"),
	Zn(30, "Zinc",65.38, "src/E30.png"),
	Ga(31, "Gallium",69.723, "src/E31.png"),
	Ge(32, "Germanium",72.630, "src/E32.png"),
	As(33, "Arsanic",74.922, "src/E33.png"),
	Se(34, "Selanium",78.971, "src/E34.png"),
	Br(35, "Bromine",79.904, "src/E35.png"),
	Kr(36, "Krypton",83.798, "src/E36.png"),
	Rb(37, "Rubidium",85.468, "src/E37.png"),
	Sr(38, "Strontium",87.62, "src/E38.png"),
	Y(39, "Yittrium",88.906, "src/E39.png"),
	Zr(40, "Zirconium",91.224, "src/E40.png"),
	Nb(41, "Niobium",92.906, "src/E41.png"),
	Mo(42, "Molybdenum",95.95, "src/E42.png"),
	Tc(43, "Technetium",98.91, "src/E43.png"),
	Ru(44, "Ruthenium",101.07, "src/E44.png"),
	Rh(45, "Rhodium",102.91, "src/E45.png"),
	Pd(46, "Palladium",106.42, "src/E46.png"),
	Ag(47, "Silver",107.87, "src/E47.png"),
	Cd(48, "Cadmium",112.41, "src/E48.png"),
	In(49, "Indium",114.82, "src/E49.png"),
	Sn(50, "Tin",118.71, "src/E50.png"),
	Sb(51, "Antimony",121.76, "src/E51.png"),
	Te(52, "Tellurium",127.60, "src/E52.png"),
	I(53, "Iodine",126.90, "src/E53.png"),
	Xe(54, "Xenon",131.29, "src/E54.png"),
	Cs(55, "Caesium",132.91, "src/E55.png"),
	Ba(56, "Barium",137.33, "src/E56.png"),
	La(57, "Lanthanum",138.91, "src/E57.png"),
	Ce(58, "Cerium",140.12, "src/E58.png"),
	Pr(59, "Praseodymium",140.91, "src/E59.png"),
	Nd(60, "Neodymium",144.24, "src/E60.png"),
	Pm(61, "Promethium",144.91, "src/E61.png"),
	Sm(62, "Samarium",150.36, "src/E62.png"),
	Eu(63, "Europium",151.96, "src/E63.png"),
	Gd(64, "Gadolinium",157.25, "src/E64.png"),
	Tb(65, "Terbium",158.93, "src/E65.png"),
	Dy(66, "Dysprosium",162.50, "src/E66.png"),
	Ho(67, "Holmium",164.93, "src/E67.png"),
	Er(68, "Erbium",167.26, "src/E68.png"),
	Tm(69, "Thumlium",168.93, "src/E69.png"),
	Yb(70, "Ytterbium",173.05, "src/E70.png"),
	Lu(71, "Lutetium",174.97, "src/E71.png"),
	Hf(72, "Hafnium",178.49, "src/E72.png"),
	Ta(73, "Tantalum",180.95, "src/E73.png"),
	W(74, "Tungsten",183.84, "src/E74.png"),
	Re(75, "Rhenium",186.21, "src/E75.png"),
	Os(76, "Osmium",190.23, "src/E76.png"),
	Ir(77, "Iridium",192.22, "src/E77.png"),
	Pt(78, "Platinum",195.08, "src/E78.png"),
	Au(79, "Gold",196.97, "src/E79.png"),
	Hg(80, "Mercury",200.59, "src/E80.png"),
	Tl(81, "Thallium",204.38, "src/E81.png"),
	Pb(82, "Lead",207.2, "src/E82.png"),
	Bi(83, "Bismuth",208.98, "src/E83.png"),
	Po(84, "Polonium",208.98, "src/E84.png"),
	At(85, "Astatin",209.98, "src/E85.png"),
	Rn(86, "Radon",222.02, "src/E86.png"),
	Fr(87, "Francium",223.02, "src/E87.png"),
	Ra(88, "Radium",226.03, "src/E88.png"),
	Ac(89, "Actinium",227.03, "src/E89.png"),
	Th(90, "Thorium",232.04, "src/E90.png"),
	Pa(91, "Protactinium",231.04, "src/E91.png"),
	U(92, "Uranium",238.03, "src/E92.png"),
	Np(93, "Neptunium",237.05, "src/E93.png"),
	Pu(94, "Plutonium",244.06, "src/E94.png"),
	Am(95, "Amercium",243.06, "src/E95.png"),
	Cm(96, "Curium",247.07, "src/E96.png"),
	Bk(97, "Berkelium",247.07, "src/E97.png"),
	Cf(98, "Californium",251.08, "src/E98.png"),
	Es(99, "Einsteinium",254.0, "src/E99.png"),
	Fm(100, "Fermium",257.10, "src/E100.png"),
	Md(101, "Mendelevium",258.10, "src/E101.png"),
	No(102, "Nobelium",259.10, "src/E102.png"),
	Lr(103, "Lawrencium",262.0, "src/E103.png"),
	Rf(104, "Rutherfordium",261.0, "src/E104.png"),
	Db(105, "Dubnium",262.0, "src/E105.png"),
	Sg(106, "Seaborgium",266.0, "src/E106.png"),
	Bh(107, "Bohrium",264.0, "src/E107.png"),
	Hs(108, "Hassium",269.0, "src/E108.png"),
	Mt(109, "Meitnerium",268.0, "src/E109.png"),
	Ds(110, "Damstadium",269.0, "src/E110.png"),
	Rg(111, "Roentgerium",272.0, "src/E111.png"),
	Uub(112, "Ununbium",285.0, "src/E112.png"),
	Uut(113, "Ununtrium",286.0, "src/E113.png"),
	Uuq(114, "Ununquadium",289.0, "src/E114.png"),
	Uup(115, "Ununpentium",290.0, "src/E115.png"),
	Uuh(116, "Ununhexium",293.0, "src/E116.png"),
	Uus(117, "Ununseptium",294.0, "src/E117.png"),
	Uuo(118, "Ununoctium",294.0, "src/E118.png");
	
	
	
	
	
	
	
	
	
	
	private final Integer atomicNumber;
	private final Double atomicWeight;
	private final String name;
	private final ImageIcon icon;
	
	Elements(Integer number, String formalName, Double weight, String icon){
		atomicNumber = number;
		name = formalName;
		atomicWeight = weight;
		this.icon = new ImageIcon(icon);
		
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
	
	public ImageIcon getIcon() {
		return icon;
	}
	
}

