# FMA-ATL

FMA-ATL is an executable formalization of a large excerpt of the model transformation language [ATL](http://www.eclipse.org/atl/) in Maude, which uses the following front-end languages:
* The [Eclipse Modeling Framework (EMF)](http://www.eclipse.org/modeling/emf/) for defining transformations
* [ATL](http://www.eclipse.org/atl/) for defining model transformations

## Modelling, Simulation and Verification of EMF-based Systems  

FMA-ATL enables ATL both for modelling and verifying EMF-based systems, i.e. systems whose state models are represented as Ecore models. In particular, 
it reuses Maude’s verification tools both to perform (possibly bounded) model checking of invariants and to model check LTL formulas in the resulting system models.

Several examples are available:

* Concurrent Append Problem:
  * [state model](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/resources/fma/atl/inplace/append/Append.emf)
  * [system specification](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/resources/fma/atl/inplace/append/Append.atl)
  * [property specification](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/resources/fma/atl/inplace/append/Append_props.atl)
  * [simulation and verification](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/groovy/fma/interpreter/atl/Append_simulation.groovy) 
* Dining philosophers with two forks:
  * [state model](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/resources/fma/atl/inplace/diningBx/diningBx.emf)
  * [system specification](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/resources/fma/atl/inplace/diningBx/DiningSpecBothForks.atl)
  * [property specification](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/resources/fma/atl/inplace/diningBx/PropSpec.atl)
  * [simulation and verification](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/groovy/fma/interpreter/atl/ModelChecker_DiningPhilosophers_LTL.groovy) 
* Ring-based version of the leader election problem:
  * [state model](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.emf)
  * [system specification](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/resources/fma/atl/inplace/leader/noSymmetry/leader.atl)
  * [property specification](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/resources/fma/atl/inplace/leader/noSymmetry/leader-props.atl)
  * [simulation and verification](https://github.com/fma-atl/fma-atl.github.io/blob/master/fma-atl.demo/src/test/groovy/fma/interpreter/atl/ModelChecker_LeaderElection_LTL.groovy) 

A tool demo is available as a Gradle project, implementing the examples above, [here](https://github.com/fma-atl/fma-atl.github.io/tree/master/fma-atl.demo).

## Credits

* FMA-ATL uses [AnATLyzer](http://anatlyzer.github.io/) to parse ATL model transformations in the front-end.
* Maude4J: An Eclipse-independent version of [Maude Development Tools](http://mdt.sourceforge.net/) for integrating Maude with Java.