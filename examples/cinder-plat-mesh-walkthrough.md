# Cinder Plat Mesh Pipe Walkthrough

I use this file as a small checklist before changing the Java implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | rollout width | 199 | ship |
| stress | quota pressure | 228 | ship |
| edge | route drift | 161 | ship |
| recovery | secret scope | 136 | watch |
| stale | rollout width | 183 | ship |

Start with `stress` and `recovery`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `quota pressure` against `secret scope`, not the raw score alone.
