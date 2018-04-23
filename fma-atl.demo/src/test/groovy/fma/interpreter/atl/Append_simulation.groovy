package fma.interpreter.atl

import fma.interpreter.utils.EmfCompareInJson
import maude4j.MaudeDaemon
import moment2.registry.EmfMetamodelRegistry
import spock.lang.Specification
import static fma.interpreter.utils.TestProperties.fmaCodePath
import fma.interpreter.atl.FmaAtlInterpreter

class Append_simulation extends Specification {
	
	public "append_example_1_singletonList"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_pre-state_1_singletonList.xmi'
		
		String targetMetamodelPath = sourceMetamodelPath
		String targetModelPath = 'src/test/resources/fma/atl/inplace/append/tmp/List_post-state_1_singletonList.xmi'
		String oracleModelPath = 'src/test/resources/fma/atl/inplace/append/List_post-state_1_singletonList.xmi'
		
		String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
		
		File outputModelFile = new File(targetModelPath)
		if (outputModelFile.exists()) outputModelFile.delete()
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		interpreter.debug_ = true
		
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		interpreter.eval(
			systemSpecPath,
			sourceMetamodelPath,
			'Root',
			sourceModelPath,
			targetMetamodelPath,
			'Root',
			['append', 'append'], // aliases used for models in module declaration
			targetModelPath,
			resolveTempClasses,
			ExecutionMode.INPLACE
		)
	
		
		File outputFile = new File('src/test/resources/fma/atl/inplace/append/module.maude')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.trafoCmd

		EmfCompareInJson comparator =  new EmfCompareInJson(fmaCodePath,targetMetamodelPath)
		boolean result = comparator.compareEmfModels(targetModelPath, oracleModelPath)
		expect: result==true
	}

	
	public "append_example_2_list"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_pre-state_2_list.xmi'
		
		String targetMetamodelPath = sourceMetamodelPath
		String targetModelPath = 'src/test/resources/fma/atl/inplace/append/tmp/List_post-state_2_list.xmi'
		String oracleModelPath = 'src/test/resources/fma/atl/inplace/append/List_post-state_2_list.xmi'
		
		String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
		
		File outputModelFile = new File(targetModelPath)
		if (outputModelFile.exists()) outputModelFile.delete()
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		interpreter.debug_ = true
		
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		interpreter.eval(
			systemSpecPath,
			sourceMetamodelPath,
			'Root',
			sourceModelPath,
			targetMetamodelPath,
			'Root',
			['append', 'append'], // aliases used for models in module declaration
			targetModelPath,
			resolveTempClasses,
			ExecutionMode.INPLACE
		)
	
		
		File outputFile = new File('src/test/resources/fma/atl/inplace/append/module.maude')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.trafoCmd

				EmfCompareInJson comparator =  new EmfCompareInJson(fmaCodePath,targetMetamodelPath)
		boolean result = comparator.compareEmfModels(targetModelPath, oracleModelPath)
		expect: result==true
	}


	public "append_02app_03cells_simulation"() {
			String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_02App_03Cell.xmi'
			
			String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			String targetModelPath = 'src/test/resources/fma/atl/inplace/append/tmp/List_02App_03Cell_output.xmi'
			String oracleModelPath = 'src/test/resources/fma/atl/inplace/append/List_02App_03Cell_output.xmi'
			
			String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
			
			File outputModelFile = new File(targetModelPath)
			if (outputModelFile.exists()) outputModelFile.delete()
			
			MaudeDaemon md = new MaudeDaemon();
			EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
			AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
			interpreter.debug_ = true
			
			String[] resolveTempClasses = ['metamodel("") ! cid("")']
					
			interpreter.eval(
				systemSpecPath,
				sourceMetamodelPath,
				'Root',
				sourceModelPath,
				targetMetamodelPath,
				'Root',
				['append', 'append'], // aliases used for models in module declaration
				targetModelPath,
				resolveTempClasses,
				ExecutionMode.INPLACE
			)
		
			
			File outputFile = new File('src/test/resources/fma/atl/inplace/append/module.maude')
			if (outputFile.exists()) outputFile.delete()
			
			outputFile << interpreter.metamodelModule
			outputFile << interpreter.trafoCmd

			EmfCompareInJson comparator =  new EmfCompareInJson(fmaCodePath,targetMetamodelPath)
			boolean result = comparator.compareEmfModels(targetModelPath, oracleModelPath)
			expect: result==true
		}

	public "append_02app_03cells__sameValue_simulation"() {
			String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_02App_03Cell_sameValue.xmi'
			
			String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			String targetModelPath = 'src/test/resources/fma/atl/inplace/append/tmp/List_02App_03Cell_sameValue_output.xmi'
			String oracleModelPath = 'src/test/resources/fma/atl/inplace/append/List_02App_03Cell_sameValue_output.xmi'
			
			String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
			
			File outputModelFile = new File(targetModelPath)
			if (outputModelFile.exists()) outputModelFile.delete()
			
			MaudeDaemon md = new MaudeDaemon();
			EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
			AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
			interpreter.debug_ = true
			
			String[] resolveTempClasses = ['metamodel("") ! cid("")']
					
			interpreter.eval(
				systemSpecPath,
				sourceMetamodelPath,
				'Root',
				sourceModelPath,
				targetMetamodelPath,
				'Root',
				['append', 'append'], // aliases used for models in module declaration
				targetModelPath,
				resolveTempClasses,
				ExecutionMode.INPLACE
			)
		
			
			File outputFile = new File('src/test/resources/fma/atl/inplace/append/module.maude')
			if (outputFile.exists()) outputFile.delete()
			
			outputFile << interpreter.metamodelModule
			outputFile << interpreter.trafoCmd
			
			EmfCompareInJson comparator =  new EmfCompareInJson(fmaCodePath,targetMetamodelPath)
			boolean result = comparator.compareEmfModels(targetModelPath, oracleModelPath)
			expect: result==true
		}

	

		
		public "stateSpace_append_02app_03cells_sameValue"() {
			String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_02App_03Cell_sameValue.xmi'
			
			String targetMetamodelPath = sourceMetamodelPath
			
			String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
			
			MaudeDaemon md = new MaudeDaemon();
			EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
			AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
			interpreter.debug_ = true
			
			String[] resolveTempClasses = ['metamodel("") ! cid("")']
					
			String results = interpreter.stateSpaceMetrics(
				systemSpecPath,
				sourceMetamodelPath,
				'Root',
				sourceModelPath,
				targetMetamodelPath,
				'Root',
				['append', 'append'], // aliases used for models in module declaration
				resolveTempClasses,
				ExecutionMode.INPLACE
			)
			
			File outputFile = new File('src/test/resources/fma/atl/inplace/append/stateSpace.maude')
			// if (outputFile.exists()) outputFile.delete()
			
			println results
			outputFile << results
			
			expect: true==true
			
		}

		public "ltl_append_02app_05cells_sameValue"() {
			String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_02App_05Cell_sameValue.xmi'
			
			String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			
			String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
			String propSpecPath = 'src/test/resources/fma/atl/inplace/append/Append_props.atl'
			String ltlFormula = '[] ~ Shared'
			
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
				'Root',
				sourceModelPath,
				targetMetamodelPath,
				'Root',
				['append', 'append'], // aliases used for models in module declaration
				resolveTempClasses,
				ExecutionMode.INPLACE
			)
			
			File outputFile = new File('src/test/resources/fma/atl/inplace/append/module.maude')
			if (outputFile.exists()) outputFile.delete()
			
			outputFile << interpreter.metamodelModule
			outputFile << interpreter.trafoCmd
			outputFile << interpreter.verificationModule
			outputFile << interpreter.modelCheckCmd
			
			expect: decision==true
			
		}

		public "ltl_append_03app_05cells_sameValue"() {
			String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_03App_05Cell_sameValue.xmi'
			
			String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			
			String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
			String propSpecPath = 'src/test/resources/fma/atl/inplace/append/Append_props.atl'
			String ltlFormula = '[] ~ Shared'
			
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
				'Root',
				sourceModelPath,
				targetMetamodelPath,
				'Root',
				['append', 'append'], // aliases used for models in module declaration
				resolveTempClasses,
				ExecutionMode.INPLACE
			)
			
			File outputFile = new File('src/test/resources/fma/atl/inplace/append/module.maude')
			if (outputFile.exists()) outputFile.delete()
			
			outputFile << interpreter.metamodelModule
			outputFile << interpreter.trafoCmd
			outputFile << interpreter.verificationModule
			outputFile << interpreter.modelCheckCmd
			
			expect: decision==true
			
		}

		public "ltl_append_03app_07cells_sameValue"() {
			String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_03App_07Cell_sameValue.xmi'
			
			String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			
			String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
			String propSpecPath = 'src/test/resources/fma/atl/inplace/append/Append_props.atl'
			String ltlFormula = '[] ~ Shared'
			
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
				'Root',
				sourceModelPath,
				targetMetamodelPath,
				'Root',
				['append', 'append'], // aliases used for models in module declaration
				resolveTempClasses,
				ExecutionMode.INPLACE
			)
			
			File outputFile = new File('src/test/resources/fma/atl/inplace/append/module.maude')
			if (outputFile.exists()) outputFile.delete()
			
			outputFile << interpreter.metamodelModule
			outputFile << interpreter.trafoCmd
			outputFile << interpreter.verificationModule
			outputFile << interpreter.modelCheckCmd
			
			expect: decision==true
			
		}

		public "ltl_append_04app_08cells_sameValue"() {
			String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_04App_08Cell_sameValue.xmi'
			
			String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			
			String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
			String propSpecPath = 'src/test/resources/fma/atl/inplace/append/Append_props.atl'
			String ltlFormula = '[] ~ Shared'
			
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
				'Root',
				sourceModelPath,
				targetMetamodelPath,
				'Root',
				['append', 'append'], // aliases used for models in module declaration
				resolveTempClasses,
				ExecutionMode.INPLACE
			)
			
			File outputFile = new File('src/test/resources/fma/atl/inplace/append/module.maude')
			if (outputFile.exists()) outputFile.delete()
			
			outputFile << interpreter.metamodelModule
			outputFile << interpreter.trafoCmd
			outputFile << interpreter.verificationModule
			outputFile << interpreter.modelCheckCmd
			
			expect: decision==true
			
		}

		public "append_01app_03cells_simulation"() {
				String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
				String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_01App_03Cell.xmi'
				
				String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
				String targetModelPath = 'src/test/resources/fma/atl/inplace/append/tmp/List_01App_03Cell_output.xmi'
				String oracleModelPath = 'src/test/resources/fma/atl/inplace/append/List_01App_03Cell_output.xmi'
				
				String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
				
				File outputModelFile = new File(targetModelPath)
				if (outputModelFile.exists()) outputModelFile.delete()
				
				MaudeDaemon md = new MaudeDaemon();
				EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
				AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
				interpreter.debug_ = true
				
				String[] resolveTempClasses = ['metamodel("") ! cid("")']
						
				interpreter.eval(
					systemSpecPath,
					sourceMetamodelPath,
					'Root',
					sourceModelPath,
					targetMetamodelPath,
					'Root',
					['append', 'append'], // aliases used for models in module declaration
					targetModelPath,
					resolveTempClasses,
					ExecutionMode.INPLACE
				)
			
				
				File outputFile = new File('src/test/resources/fma/atl/inplace/append/module.maude')
				if (outputFile.exists()) outputFile.delete()
				
				outputFile << interpreter.metamodelModule
				outputFile << interpreter.trafoCmd
				
				EmfCompareInJson comparator =  new EmfCompareInJson(fmaCodePath,targetMetamodelPath)
				boolean result = comparator.compareEmfModels(targetModelPath, oracleModelPath)
				expect: result==true
			}


		public "ltl_append_02app_03cells_sameValue"() {
			String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			String sourceModelPath = 'src/test/resources/fma/atl/inplace/append/List_02App_03Cell_sameValue.xmi'
			
			String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/append/Append.ecore'
			
			String systemSpecPath = 'src/test/resources/fma/atl/inplace/append/Append.atl'
			String propSpecPath = 'src/test/resources/fma/atl/inplace/append/Append_props.atl'
			String ltlFormula = '[] ~ Shared'
			
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
				'Root',
				sourceModelPath,
				targetMetamodelPath,
				'Root',
				['append', 'append'], // aliases used for models in module declaration
				resolveTempClasses,
				ExecutionMode.INPLACE
			)
			
			File outputFile = new File('src/test/resources/fma/atl/inplace/append/module.maude')
			if (outputFile.exists()) outputFile.delete()
			
			outputFile << interpreter.metamodelModule
			outputFile << interpreter.trafoCmd
			outputFile << interpreter.verificationModule
			outputFile << interpreter.modelCheckCmd
			
			expect: decision==true
			
		}

}
