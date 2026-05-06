# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its platform engineering focus without claiming live deployment or external usage.

## Cases

- `baseline`: `rollout width`, score 199, lane `ship`
- `stress`: `quota pressure`, score 228, lane `ship`
- `edge`: `route drift`, score 161, lane `ship`
- `recovery`: `secret scope`, score 136, lane `watch`
- `stale`: `rollout width`, score 183, lane `ship`

## Note

The useful failure mode here is a wrong decision on a named case, not a vague style disagreement.
