/*
 * Copyright 2015 Delft University of Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package science.atlarge.graphalytics.kgraphs.algorithms.cdlp;

import science.atlarge.graphalytics.domain.algorithms.AlgorithmParameters;
import science.atlarge.graphalytics.domain.algorithms.CommunityDetectionLPParameters;
import science.atlarge.graphalytics.execution.RunSpecification;
import science.atlarge.graphalytics.domain.benchmark.BenchmarkRun;
import science.atlarge.graphalytics.kgraphs.KafkaGraphsJob;
import science.atlarge.graphalytics.kgraphs.KafkaGraphsConfiguration;

/**
 * Community Detection job implementation for KafkaGraphs. This class is responsible for formatting CDLP-specific
 * arguments to be passed to the platform executable, and does not include the implementation of the algorithm.
 *
 * @author Robert Yokota
 */
public final class CommunityDetectionLPJob extends KafkaGraphsJob {

	private final long iteration;

	/**
	 * Creates a new BreadthFirstSearchJob object with all mandatory parameters specified.
	 *
	 * @param platformConfig the platform configuration.
	 * @param inputPath the path to the loaded graph.
	 */
	public CommunityDetectionLPJob(RunSpecification runSpecification, KafkaGraphsConfiguration platformConfig,
								   String inputPath, String outputPath) {
		super(runSpecification, platformConfig, inputPath, outputPath);

		AlgorithmParameters parameters = runSpecification.getBenchmarkRun().getAlgorithmParameters();
		this.iteration = ((CommunityDetectionLPParameters)parameters).getMaxIterations();
	}

	@Override
	protected void appendAlgorithmParameters() {

		commandLine.addArgument("--algorithm");
		commandLine.addArgument("cdlp");

		commandLine.addArgument("--max-iteration", false);
		commandLine.addArgument(String.valueOf(iteration), false);
	}

}
