# cinder-plat-mesh-pipe

`cinder-plat-mesh-pipe` is a Java project for Platform engineering. It turns package a Java local lab for mesh analysis with capacity fixtures, allocation and spill reports, and documented operating limits into a small local model with readable fixtures and a direct verification command.

## Reading Cinder Plat Mesh Pipe

Start with the README, then open `metadata/project.json` to check the constants behind the examples. After that, `fixtures/cases.csv` shows the compact path and `examples/extended_cases.csv` gives a wider look at the same rule.

## Purpose

This project keeps the domain idea close to the tests. That makes it useful as a reference implementation, a small experiment, or a starting point for a more specialized tool.

## Design Sketch

The project is organized around a compact model rather than a large framework. Inputs are scored, classified, and checked against golden fixtures. The constants live in code and are mirrored in metadata so documentation drift is easy to catch. The Java implementation uses a compact package layout and direct assertion checks.

## Fixture Notes

`pressure` is the first example I would inspect because it lands on the `review` path with a score of 110. The broader file also keeps `degraded` at -10 and `recovery` at 253, which gives the model a useful low-to-high spread.

## What It Does

- Uses fixture data to keep route policy changes visible in code review.
- Includes extended examples for rollout constraints, including `recovery` and `degraded`.
- Documents environment checks tradeoffs in `docs/operations.md`.
- Runs locally with a single verification command and no external credentials.
- Stores project constants and verification metadata in `metadata/project.json`.

## Setup

The only required setup is the local Java toolchain. After cloning, stay in the repo root so fixture paths resolve correctly.

## Verification

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/audit.ps1
```

The audit command checks repository structure and README constraints before it delegates to the verifier.

## Files Worth Reading

- `src`: primary implementation
- `tests`: verification harness
- `fixtures`: compact golden scenarios
- `examples`: expanded scenario set
- `metadata`: project constants and verification metadata
- `docs`: operations and extension notes
- `scripts`: local verification and audit commands

## Limits

The fixture set is deliberately small. That keeps the review surface clear, but it also means the model should not be treated as a complete domain simulator.

## Next Directions

- Add a loader for `examples/extended_cases.csv` and promote selected cases into the language test suite.
- Add a short report command that prints the score breakdown for a single scenario.
- Add malformed input fixtures so the failure path is as visible as the happy path.
- Add one more platform engineering fixture that focuses on a malformed or borderline input.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

This runs the language-level build or test path against the compact fixture set.
