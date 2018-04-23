package fma.interpreter.atl

import fma.interpreter.utils.EmfCompareInJson
import maude4j.MaudeDaemon
import moment2.registry.EmfMetamodelRegistry
import spock.lang.Specification
import static fma.interpreter.utils.TestProperties.fmaCodePath
import fma.interpreter.atl.FmaAtlInterpreter

class ModelChecker_DiningPhilosophers_LTL extends Specification {
	
	public "dining_03phil_modelCheck_bothForks"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/diningBx/diningBx.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/diningBx/Table03.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/diningBx/diningBx.ecore'
		
		String systemSpecPath = 'src/test/resources/fma/atl/inplace/diningBx/DiningSpecBothForks.atl'
		String propSpecPath = 'src/test/resources/fma/atl/inplace/diningBx/PropSpec.atl'
		String ltlFormula = '[] ~ sharedFork'
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		interpreter.debug_ = true
				
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
						
		boolean decision = interpreter.modelCheckLTL(
			systemSpecPath,
			propSpecPath,
			ltlFormula,
			sourceMetamodelPath,
			'Table',
			sourceModelPath,
			targetMetamodelPath,
			'Table',
			['dP', 'dP'], // aliases used for models in module declaration
			resolveTempClasses,
			ExecutionMode.INPLACE
		)
						
		
		File outputFile = new File('src/test/resources/fma/atl/inplace/diningBx/module.maude')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.trafoCmd
		outputFile << interpreter.verificationModule
		outputFile << interpreter.modelCheckCmd
						
		expect: decision==true
	}
	
	public "dining_04phil_modelCheck_bothForks"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/diningBx/diningBx.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/diningBx/Table04.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/diningBx/diningBx.ecore'
		
		String systemSpecPath = 'src/test/resources/fma/atl/inplace/diningBx/DiningSpecBothForks.atl'
		String propSpecPath = 'src/test/resources/fma/atl/inplace/diningBx/PropSpec.atl'
		String ltlFormula = '[] ~ sharedFork'
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		interpreter.debug_ = true
				
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
						
		boolean decision = interpreter.modelCheckLTL(
			systemSpecPath,
			propSpecPath,
			ltlFormula,
			sourceMetamodelPath,
			'Table',
			sourceModelPath,
			targetMetamodelPath,
			'Table',
			['dP', 'dP'], // aliases used for models in module declaration
			resolveTempClasses,
			ExecutionMode.INPLACE
		)
						
		
		File outputFile = new File('src/test/resources/fma/atl/inplace/diningBx/module.maude')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.trafoCmd
		outputFile << interpreter.verificationModule
		outputFile << interpreter.modelCheckCmd
						
		expect: decision==true
	}
	
	public "dining_05phil_modelCheck_bothForks"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/diningBx/diningBx.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/diningBx/Table05.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/diningBx/diningBx.ecore'
		
		String systemSpecPath = 'src/test/resources/fma/atl/inplace/diningBx/DiningSpecBothForks.atl'
		String propSpecPath = 'src/test/resources/fma/atl/inplace/diningBx/PropSpec.atl'
		String ltlFormula = '[] ~ sharedFork'
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		interpreter.debug_ = true
				
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		boolean decision = interpreter.modelCheckLTL(
				systemSpecPath,
				propSpecPath,
				ltlFormula,
				sourceMetamodelPath,
				'Table',
				sourceModelPath,
				targetMetamodelPath,
				'Table',
				['dP', 'dP'], // aliases used for models in module declaration
				resolveTempClasses,
				ExecutionMode.INPLACE
				)
		
		
		File outputFile = new File('src/test/resources/fma/atl/inplace/diningBx/module.maude')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.trafoCmd
		outputFile << interpreter.verificationModule
		outputFile << interpreter.modelCheckCmd
		
		expect: decision==true
	}

	
	public "dining_08phil_modelCheck_bothForks"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/diningBx/diningBx.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/diningBx/Table08.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/diningBx/diningBx.ecore'
		
		String systemSpecPath = 'src/test/resources/fma/atl/inplace/diningBx/DiningSpecBothForks.atl'
		String propSpecPath = 'src/test/resources/fma/atl/inplace/diningBx/PropSpec.atl'
		String ltlFormula = '[] ~ sharedFork'
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		interpreter.debug_ = true
				
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		boolean decision = interpreter.modelCheckLTL(
			systemSpecPath,
			propSpecPath,
			ltlFormula,
			sourceMetamodelPath,
			'Table',
			sourceModelPath,
			targetMetamodelPath,
			'Table',
			['dP', 'dP'], // aliases used for models in module declaration
			resolveTempClasses,
			ExecutionMode.INPLACE
		)
		
		
		File outputFile = new File('src/test/resources/fma/atl/inplace/diningBx/module.maude')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.trafoCmd
		outputFile << interpreter.verificationModule
		outputFile << interpreter.modelCheckCmd
		
		expect: decision==true
	}

}
